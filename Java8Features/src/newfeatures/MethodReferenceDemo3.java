package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		Order od1=new Order(1000,"GOOG.NS",12000.10,Order.Side.BUY);
		Order od2=new Order(500,"MS.TS",5000.10,Order.Side.SELL);
		Order od3=new Order(750,"GOOG.NS",8000.10,Order.Side.BUY);
		List<Order> orderBook=new ArrayList<Order>();
		orderBook.add(od1);
		orderBook.add(od2);
		orderBook.add(od3);
		//Sort all order based on quantity using lambda
		System.out.println("Before Sorting: "+orderBook);
		
		Collections.sort(orderBook,(a,b)->Order.compareByQuantity(a, b));
		System.out.println("After Sorting: "+orderBook);
		
		//Sort on all order using quantity using method reference
		Collections.sort(orderBook,Order::compareByQuantity);
		System.out.println("After Sorting: "+orderBook);		
		//Sort all orders based on price using Method Reference
		Order order=orderBook.get(0);
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("Order bOOK aFTER sORTING: "+ orderBook);
		//method reference example for arbitary object of a particular types
		String[] symbols= {"GOOGLE","AMAZON","microsoft","apple"};
		Arrays.sort(symbols,String::compareToIgnoreCase);
		for(String i:symbols)
		System.out.println(i);

	}

}
