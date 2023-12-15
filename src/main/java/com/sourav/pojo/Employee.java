package com.sourav.pojo;


public class Employee {
	
	int empId;
	String name;
	int deptId;
	String departmentName;
	String gender;
	int age;
	int salary;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public Employee(int empId, String name, String gender, int age) {
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int empId, String name, int deptId, String departmentName, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.deptId = deptId;
		this.departmentName = departmentName;
		this.salary = salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		empId=i;
		name=string;
		deptId=j;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee get() {
		return  new Employee();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
