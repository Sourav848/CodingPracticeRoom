package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.sourav.pojo.Employee;

//question practice - https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

public class StreamAPIObjectExample {
	
	
	public static void main(String[] args) {
		
 
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Mohan", "Male", 35, 100, "HR", 500, 2010));
        employeeList.add(new Employee(5, "Ramesh", "Male", 38, 100, "HR", 6000, 2010));
        employeeList.add(new Employee(5, "Richa", "Female", 38, 100, "HR", 6000, 2010));
        employeeList.add(new Employee(3, "Nima", "Female", 27, 200, "Account ", 8000, 2013));
        employeeList.add(new Employee(3, "Karel", "Female", 17, 200, "Account ", 8000, 2013));
        employeeList.add(new Employee(2, "Jaden", "Male", 21, 200, "Security", 1000, 2018));
        employeeList.add(new Employee(4, "Akanksha", "Female",28, 200, "Product Development", 12000, 2018));
        employeeList.add(new Employee(4, "Sourav", "LGBQT",27, 200, "Product Development", 10000, 2018));
        
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
  			
  		String maxSalary  = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get().getName();
  		  		
  		System.out.println("Max Salary Employee name is: " + maxSalary);
  		//second max sal(CTS)
  		System.out.println("Second Max Salary is: " + employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip((employeeList.size()-2)).findFirst().get().getName());

  		//find deptname whose sal is maximum
  		Map<String, Optional<Employee>> mapEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
  		mapEmp.forEach((character, frequency) -> System.out.println(character + ": " + frequency.get().getSalary()));
  		
  		//Average age of male and female employee
  		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		         
		System.out.println(avgAgeOfMaleAndFemaleEmployees);
		
		//Youngest employee in Product Development departmentName
		Employee emp = employeeList.stream().filter(e-> "Product Development".equals(e.getDepartmentName())).min(Comparator.comparing(Employee::getAge)).get();
		System.out.println("Youngest employee of dept == Product Development :"+ emp.getName());
		
		//Youngest employee in each departmentName
		Map<String, Optional<Employee>> mapEmp1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.minBy(Comparator.comparing(Employee::getAge))));
  		mapEmp1.forEach((key, val)-> System.out.println(key+" : "+val.get().getName()));
		
		//Count male and female emp who works in HR team
		Map<String, Long> mapGender = employeeList.stream().filter(i -> "HR".equals(i.getDepartmentName())).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(mapGender);
		
		
		//Print the department name and employee name who is working on it e.g Account = [Nima, Karel] >> Relation in grouping is one to many(key vs Multiple Value)
		Map<String, List<String>> mapEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentName,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(mapEachDept);
		
		//Print names of employees for their respective department >> Relation in grouping is one to one(key vs Value)
		Map<String, List<String>> mapEachDept1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getDepartmentName, Collectors.toList())));
		System.out.println(mapEachDept1);
		
		System.out.println("Total Salary of whole Organisation :"+ employeeList.stream().mapToInt(Employee::getSalary).sum());
		
		System.out.println("Average Salary of whole Organisation :"+ employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));
		
	    //Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?	
		Map<Boolean, List<Employee>> employeeSepartionedByAge = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 27));
		
		for (Map.Entry<Boolean, List<Employee>> entrySet : employeeSepartionedByAge.entrySet()) {
			if (entrySet.getKey())
				entrySet.getValue().forEach(j-> System.out.println("Greater then 27 :" + j.getName()));
			else 
				entrySet.getValue().forEach(j-> System.out.println("Less then 27 :" +j.getName()));
		}
		
		
		String name = employeeList.stream().map(Employee::getName).min(Comparator.comparing(String::length)).get();
		System.out.println("Shortest name length of the employee :"+ name);
		
	}
	
}
