package newfeatures;
//program to demonstrate method reference to an instance method
@FunctionalInterface
interface IDemo{
	void sum(int x,int y);
}
class Calculation
{
void addition(int a,int b) {
	System.out.println("The Addition is: "+(a+b));
}
}
public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		Calculation c1=new Calculation();
		//using lambda expression
		IDemo d1=(a,b)->System.out.println("The Addition is: "+(a+b));
		d1.sum(10,45);
		
		//Using Method Reference
		IDemo d2=c1::addition;
		d2.sum(200, 150);
	}

}
