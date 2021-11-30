package newfeatures;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		/*String s=null;
		Integer a=null;
		System.out.println(s.length());*/
		//String s="Hello World";
		String s=null;
		//Optional object is a container or not
		Optional<String> chkNull=Optional.ofNullable(s);
		 if(chkNull.isPresent()) {
			 System.out.println("Length of String: "+s.length());
		     chkNull.ifPresent(System.out::println);
		     System.out.println(s.toUpperCase());
		     System.out.println(chkNull.get());
		 }
		 else {
			 System.out.println("String not present");
		 }

	}

}
