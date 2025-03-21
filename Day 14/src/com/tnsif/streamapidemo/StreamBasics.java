package com.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//step 1 -Source
		//List<Integer> numList=new ArrayList<>(); //mutable list
		List<Integer> numList=Arrays.asList(12,56,45,78,34,78,12); //immutable
		//numList.add(34);
		System.out.println(numList);
		
		//step 2
		Stream<Integer> strList=numList.stream();
		
		Long c=strList.count();
		System.out.println(c);
		//strList.forEach(x->System.out.println(x));//IllegalStateException
		System.out.println("________________________");
		//map
		Stream<Integer> num=numList.stream();
		Stream<Integer> mapStr=num.map(no->no*2);
		mapStr.forEach(x->System.out.println(x));
		System.out.println("________________________");
		numList.stream().map(no->no+1).distinct().forEach(x->System.out.println(x));
		//step 1-Source-Arrays/Collection
		//step-2 convert source to stream
		//step-3-Intermediate
		//step 4 terminal method
		
		
		List<Integer> values=Arrays.asList(34,654,12,65,878,989);
		Stream<Integer> str=values.stream();
		str.map(x->x-2).forEach(c1->System.out.println(c1));
		
		//map-accepts function input
		
		System.out.println("____________________");
		Function<Integer,Integer> str1=x->x-2;
		Stream<Integer>stream=values.stream();
		stream.map(str1).forEach(System.out::println);//method reference
		System.out.println("____________________");
		//distinct
		/*
		 * Stream<Integer> number=numList.stream(); Stream<Integer>
		 * disNum=number.distinct(); disNum.forEach(System.out::println);
		 */
		
		//numList.stream().distinct().skip(2).forEach(System.out::println);
		numList.stream().distinct().limit(3).forEach(System.out::println);
		System.out.println("____________________");
		//filter-even numbers
		Stream<Integer> stream1=numList.stream();
		stream1.filter(x->x%2==0).forEach(System.out::println);
		System.out.println("____________________");
		//odd numbers
		Stream<Integer> stream2=numList.stream();
		Predicate<Integer> pre=x->x%2!=0;
		//stream2.filter(pre).forEach(System.out::println);
		//List<Integer> listNum=stream2.filter(x->x%2==0).toList();
		//System.out.println(listNum);
		
		//reduce-addtion of elements
		Optional<Integer> result=stream2.reduce((x,y)->x+y);
		System.out.println(result.get());
		
		//reduce-max value
		Optional<Integer> result1=numList.stream().reduce((x,y)->x>y?x:y);
		System.out.println(result1.get());
		
		//ArrayList of strings
		List<String> names=Arrays.asList("Ayub","Nishant","Sufeen","Sumaiya","Pragati","Mithilesh");
		names.stream().limit(4).forEach(System.out::println);
		
}
}
