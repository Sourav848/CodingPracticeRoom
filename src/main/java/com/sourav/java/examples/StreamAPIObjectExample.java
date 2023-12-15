package com.sourav.java.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import com.sourav.pojo.Employee;


public class StreamAPIObjectExample {
	
	
	public static void main(String[] args) {
		
 
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "Ramesh", 100, "HR", 5000));
        list.add(new Employee(3, "Suresh", 200, "IT", 8000));
        list.add(new Employee(2, "Mahesh", 200, "IT", 1000));
        
        //Sorting on the basis of ID
  		list.stream().sorted(Comparator.comparing(Employee::getEmpId)).map(Employee::getEmpId).forEach(System.out::println);
  				
  		list.stream().map(Employee::getDepartmentName).distinct().forEach(System.out::println);
  		
  		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
  		System.out.println(map);
  		
  		
  		System.out.println("Sorting on the basis emp id...");
  		list.stream().sorted(Comparator.comparing(Employee::getEmpId)).map(Employee::getEmpId).forEach(System.out::println);
  		
  		int maxSalary  = list.stream().mapToInt(Employee::getSalary).max().getAsInt();
  		
  		list.stream().filter(emp->emp.getSalary()==maxSalary).map(Employee::getName).forEach(System.out::println);
  		
  		list.stream().filter(emp->emp.getSalary()==maxSalary).forEach(i->System.out.println(i.getName()));
  		
	}
	
}
