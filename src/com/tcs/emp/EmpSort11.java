package com.tcs.emp;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmpSort11 {

	public static void main(String[] args) {
		
		Map<Integer, Employee> emp = new TreeMap<Integer, Employee>();
		
		Employee emp1 = new Employee(123, "Pavitra", 32, "Chennai");
		Employee emp2 = new Employee(234, "Mohith",  24, "Tirupati");
		Employee emp3 = new Employee(345, "Vibhav", 26, "Thanjavur");
		Employee emp4 = new Employee(456, "Naseeha", 22, "Malapuram");
		Employee emp5 = new Employee(567, "Indhuja", 24, "Dharapuram");
		Employee emp6 = new Employee(678, "Saranya", 40, "Chennai");
		Employee emp7 = new Employee(789, "Santosh", 30, "Coimbatore");
		Employee emp8 = new Employee(908, "Meera",  28, "Chennai");
		
		emp.put(emp4.getEmpId(), emp4);
		emp.put(emp3.getEmpId(), emp3);
		emp.put(emp1.getEmpId(), emp1);
		emp.put(emp5.getEmpId(), emp5);
		emp.put(emp8.getEmpId(), emp8);
		emp.put(emp6.getEmpId(), emp6);
		emp.put(emp2.getEmpId(), emp2);
		emp.put(emp7.getEmpId(), emp7);
		
		System.out.println(emp.size());
		int a= 24;
		String b = "Chennai";
		
		
		Map<Integer, Employee> result = emp.entrySet().stream()
				.filter(p -> p.getKey() >=a)
				.filter(p1 ->p1.getValue().getEmpCity() == b)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		
		

		System.out.println("---List is---");
		
		for(Map.Entry<Integer, Employee> map : result.entrySet()) {
			
			System.out.println("Key is:: " +map.getKey() + " & " + "Value is::" +map.getValue());
		}

	}

}
