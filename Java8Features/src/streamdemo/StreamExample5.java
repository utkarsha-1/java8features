package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
		
		//limit Function
		//iterate --used to define infinite sequential stream
		Stream<Integer> evenInfiniteStream=Stream.iterate(0, n->n+2);
		List<Integer> evenList=evenInfiniteStream.limit(10).collect(Collectors.toList());
		System.out.println("Even nos with limit 10");
		System.out.println(evenList);
		
		System.out.println("*************");
		Stream<Integer> oddInfiniteStream=Stream.iterate(1, n->n+2);
		// Converting Stream to Set
		Set<Integer> oddList=oddInfiniteStream.limit(10).collect(Collectors.toSet());
		System.out.println("Odd nos with limit 10");
		System.out.println(oddList);
		
		//Distint elements
		
		List<String> desig=Arrays.asList("Manager","Technician","Salesman","Developer","Manager");
		List<String> distinctDesig=desig.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctDesig);
		
		//skip--skip first n elements
		Stream<Integer> evenInfiniteStream1=Stream.iterate(0, n->n+2);
		List<Integer> evenList1=evenInfiniteStream1.skip(5).limit(10).collect(Collectors.toList());
		System.out.println("Even nos with  skip of first 5 numbers limit 10");
		System.out.println(evenList1);
		
		//any match()
		boolean match=desig.stream().anyMatch(s->s.contains("Developer"));
		System.out.println("Developer exists or not: ?"+match);
		
		

	}

}
