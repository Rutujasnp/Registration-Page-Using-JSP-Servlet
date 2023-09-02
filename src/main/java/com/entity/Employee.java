package com.entity;


public class Employee {
private String id;
private String name;
private String age;
private String gmail_id;
private  String salary;
private String password;

//public Employee(String id, String name, String age, String gmail, String salary, String password) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.age = age;
//	this.gmail_id = gmail_id;
//	this.salary = salary;
//	this.password = password;
//}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

public String getGmail() {
	return gmail_id;
}
public void setGmail(String gmail_id) {
	this.gmail_id = gmail_id;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", mail=" + gmail_id + ", salary=" + salary + "]";
}

}
