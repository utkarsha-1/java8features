package newfeatures;

public class LambdaDemo4 {

	public static void main(String[] args) {
		Addition op1=(a,b)->(a+b);
		System.out.println("Addition of 2 nos is: "+op1.calculate(200,166));
		Addition op2=(a,b)->(a-b);
		System.out.println("Addition of 2 nos is: "+op2.calculate(200,166));
		Addition op3=(a,b)->(a*b);
		System.out.println("Addition of 2 nos is: "+op3.calculate(200,166));
		Addition op4=(a,b)->(a/b);
		System.out.println("Addition of 2 nos is: "+op4.calculate(200,166));
		MyString myName1=(name)->{ return "Hello " + name;};
		System.out.println(myName1.myStringFunction("Raj Goswami"));
	}

}
