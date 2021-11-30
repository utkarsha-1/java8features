package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample3 {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Amit");
		names.add("Shekar");
		names.add("Aman");
		names.add("Rahul");
		names.add("Sonam");
		names.add("Salman");
		names.add("Lokesh");
		names.add("Navin");
		
		names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println("*******Sorting*******");
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		//collect stream as list
		List<String> namesUpperCase=names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("******New List********");
		System.out.println(namesUpperCase);
		//Count operation
		long cnt=names.stream().count();
		System.out.println("No of elements:"+cnt);
		long cnt1=names.stream().filter((s)->s.startsWith("A")).count();
		System.out.println("No.of Names starting with A"+cnt1);
		//reduce operation
		Optional<String> red=names.stream().reduce((s1,s2)->s1+ "#"+s2);
		red.ifPresent(System.out::println);
		Integer[] marks= {45,88,99,45,75,23};
		int sum=Arrays.stream(marks).reduce(0, (a,b)->a+b);
		System.out.println("Sum of Marks :"+ sum);
		
		System.out.println("***Display numbers from 1 to 100 using stream***");
		IntStream.range(1, 101).forEach(i->System.out.print(i+" "));
		
		
		

	}

}
