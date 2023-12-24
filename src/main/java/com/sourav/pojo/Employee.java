package com.sourav.pojo;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	int empId;
	String name;
	int deptId;
	String departmentName;
	String gender;
	int age;
	int salary;
	int yearOfJoining;
	List<String> femaleFriends=new ArrayList<String>();

	public Employee(int empId, String name, String gender, int age, int deptId, String departmentName, int salary,
			int yearOfJoining) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.deptId = deptId;
		this.departmentName = departmentName;
		this.salary = salary;
		this.yearOfJoining = yearOfJoining;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public List<String> getFemaleFriends() {
		return femaleFriends;
	}

	public void setFemaleFriends(List<String> femaleFriends) {
		this.femaleFriends = femaleFriends;
	}

}
