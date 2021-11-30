package newfeatures;

//block lambda statements
public class LambdaDemo3 {

	public static void main(String[] args) {
		MyString reverseStr=(str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));

	//First Example
	MyString myName=(name)->{ return "Hello " + name;};
	System.out.println(myName.myStringFunction("Raj"));
	//Another Example
	MyString myName1=(name)->{ return "Hello " + name;};
	System.out.println(myName1.myStringFunction("Raj Goswami"));

}}
