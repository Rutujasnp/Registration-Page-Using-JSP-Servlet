package com.demo.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Dao.EmployeeDao;
import com.entity.Employee;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao ed;

	public void init() {
		ed = new EmployeeDao();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("src/main/webapp/Update.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String fullName = request.getParameter("fullName");
		String age = request.getParameter("age");
		String gmail_id = request.getParameter("gmail_id");
		String salary = request.getParameter("salary");
		String password = request.getParameter("password");

		Employee ee = new Employee();
		ee.setId(id);
		ee.setName(fullName);
		ee.setAge(age);
		ee.setGmail(gmail_id);
		ee.setPassword(password);
		ee.setSalary(salary);

		try {
			EmployeeDao.updateEmployee(ee);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Data NOT inserted!!!");
		}

		// RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.html");

		// dispatcher.forward(request, response);
		response.sendRedirect("UpdateResult.html");
		//doGet(request, response);
	}

}
