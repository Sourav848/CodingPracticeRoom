package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sourav.pojo.Employee;

//question practice - https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

public class StreamAPIObjectExample {
	
	
	public static void main(String[] args) {
		
 
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Mohan", "Male", 35, 100, "HR", 500, 2010));
        employeeList.add(new Employee(5, "Ramesh", "Male", 38, 100, "HR", 6000, 2010));
        employeeList.add(new Employee(3, "Nima", "Female", 27, 200, "Account ", 8000, 2013));
        employeeList.add(new Employee(2, "Jaden", "Male", 21, 200, "Security", 1000, 2018));
        employeeList.add(new Employee(4, "Akanksha", "Female",28, 200, "Product Development", 12000, 2018));
        
        //Sorting on the basis of ID
        System.out.print("Sorting on the basis emp id...");
  		employeeList.stream().sorted(Comparator.comparing(Employee::getEmpId)).forEach(emp->System.out.println(emp.getEmpId()));
  		
  		//Minimum salary of the employee
  		System.out.print("Minimum salary of the employee is: ");
  		System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get().getName());
  		 
  		//print name of all department 
  		employeeList.stream().map(Employee::getDepartmentName).distinct().forEach(System.out::println);
  		
  		//(Nagarro) print dept name with count of employee
  		Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
  		System.out.println(map);
  			
  		int maxSalary  = employeeList.stream().mapToInt(Employee::getSalary).max().getAsInt();
  		  		
  		employeeList.stream().filter(emp->emp.getSalary()==maxSalary).forEach(i->System.out.println(i.getName()));
  		
  		//second max sal
  		System.out.println("Second Max Salary is: " + employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip((employeeList.size()-2)).findFirst().get().getName());

  		//find deptname whose sal is maximum
  		Map<String, Optional<Employee>> mapEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
  		mapEmp.forEach((character, frequency) -> System.out.println(character + ": " + frequency.get().getSalary()));
  		
  		//Average age of emmployee
  		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
  				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
  				         
  				System.out.println(avgAgeOfMaleAndFemaleEmployees);
	}
	
}
