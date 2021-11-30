package newfeatures;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can iterate over the elements in the collection. “forEach” is a default method defined in the Iterable interface. It is used by the Collection classes that extend the Iterable interface to iterate elements.

The “forEach” method takes the Functional Interface as a single parameter i.e. you can pass Lambda Expression as an argument.
 */

public class ForrEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages=new ArrayList<String>();
		languages.add("Java");
		languages.add("C++");
		languages.add("python");
		languages.add("Ruby");
		System.out.println("****Programming languages***");
		languages.forEach(i -> System.out.println(i));
		System.out.println("**print elements using method reference***");
		languages.forEach(System.out::println);
		Map<Integer,String> customer=new HashMap<Integer,String>();
		customer.put(101,"Alex");
		customer.put(102,"Mike");
		customer.put(101,"Alex");
		customer.put(101,"Alex");
		System.out.println("***customers***");
		customer.forEach ((k,v)-> System.out.println("Key="+k+"--->value="+v));
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		//use lambda expression to print elements of arraylist
		System.out.println("***array list elements***");
		arrL.forEach(i -> System.out.println(i));
		
		System.out.println("***Even number in array list***");
		arrL.forEach(n->{if(n%2==0) System.out.println(n);});
		
		ArrayList<Integer> arrM=new ArrayList<Integer>();
		arrM.add(100);
		arrM.add(24);
		arrM.add(99);
		arrM.add(12);
		Collections.sort(arrM);
		arrM.forEach(i->System.out.println(i));
		
		


	}

}
