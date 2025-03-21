package com.tnsif.streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmpStreamDemo {

	public static void main(String[] args) {
			
		List<Employee> empList=Arrays.asList(
				               new Employee("Ayub",1,6427.797f),
				               new Employee("Mithilesh",2,879847.77f),
				               new Employee("Sahil",3,374638.66f));
		
		System.out.println(empList);
		
		Stream<Employee> empStream=empList.stream();
		
		//map
		//calculate bonus -5%
		Function<Employee,Float> bonus=(emp)-> emp.getSalary()*0.05f;
		empStream.map(bonus).forEach(System.out::println);
		
		//filter
		
		Stream<Employee> empStream1=empList.stream();
		//Predicate<Employee> name=emp->emp.getName().length()>4;
		List<Employee> newNames=empStream1.filter(emp->emp.getName().length()>4).toList();
		System.out.println(newNames);
		
		
	
	}

}
