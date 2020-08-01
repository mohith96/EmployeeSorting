package com.tcs.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSort {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		
		
		emp.add(new Employee(123, "Pavitra", 32, "Chennai"));
		emp.add(new Employee(234, "Mohith",  24, "Tirupati"));
		emp.add(new Employee(345, "Vibhav", 26, "Thanjavur"));
		emp.add(new Employee(456, "Naseeha", 22, "Malapuram"));
		emp.add(new Employee(567, "Indhuja", 24, "Dharapuram"));
		emp.add(new Employee(678, "Saranya", 40, "Chennai"));
		emp.add(new Employee(789, "Santosh", 28, "Coimbatore"));
		
		List<Employee> getSpecificEmp = emp.stream()
                .filter(d -> d.getEmpAge() >= 24)
                .collect(Collectors.toList());
		
		Collections.sort(getSpecificEmp, new Comparator<Employee>() {
     
			public int compare(Employee emp1, Employee emp2) {
				
				return emp2.getEmpName().compareTo(emp1.getEmpName());
			}
			
		});
		
		
		System.out.println("---List is---");
		
		for(Employee empp: getSpecificEmp) {
			
			System.out.println(empp);
		}
		
	
		}


	}


