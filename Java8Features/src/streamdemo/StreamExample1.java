package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		Integer[] marks= {45,88,99,45,75,23};
		//Build stream from arrays
		Stream<Integer> strm=Stream.of(marks);
		strm.forEach(i->System.out.println(i));
//Build stream from collection
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(9);
		grades.add(7);
		grades.add(1);
		grades.add(2);
		grades.add(5);
		Stream<Integer> strm1=grades.stream();
		//strm1.forEach(i->System.out.println(i));
		System.out.println("Array list");
		strm1.forEach(System.out::println);
		
		List<Integer> squares=grades.stream().map(m->m*m).collect(Collectors.toList());
		System.out.println("***Double of grades****");
		System.out.println(squares);
	}

}
