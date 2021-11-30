package newfeatures;

import java.time.LocalDate;

interface Parser{

default void parse(){
System.out.println("default Parsing logic");
}
static void displayDate() {
	System.out.println(LocalDate.now());
}
}
class TextParser implements Parser{
	//inherit the default implementation of parser
}
class XMLParser implements Parser{
	public void parse(){
		System.out.println("Parsing XML files");
	}
}
public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		Parser p=new TextParser();
		p.parse();
		
		p=new XMLParser();
		p.parse();
		System.out.println("Program excuted at:");
		Parser.displayDate();

	}

}
