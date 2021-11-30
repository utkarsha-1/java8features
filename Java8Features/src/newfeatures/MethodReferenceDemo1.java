package newfeatures;
//Method Reference-shorthand of lambda expression
@FunctionalInterface
interface MyInterface{
	void myMethod();
}

class Test //instance class
{
void display() {
	System.out.println("M a instance method");
}	
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.display();
		//Java 8 Method reference approach
		MyInterface m1ref=t1::display; //method reference of an object
		m1ref.myMethod();

	}

}
