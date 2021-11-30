package newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaComparatorDemo {

	public static void main(String[] args) {
		Student s1=new Student(101,"Ryan",78);
		Student s2=new Student(105,"Mani",81);
		Student s3=new Student(104,"John",12);
		Student s4=new Student(103,"Jane",99);
		Student s5=new Student(102,"Keith",43);
		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		Collections.sort(sList,(st1,st2)->{return st1.name.compareTo(st2.name);});
		//enhanced for loop
		for(Student s:sList) {
			System.out.println(s.rollNumber+" "+s.name+" "+s.marks);
		}
		
		//sort in descending order
		System.out.println("***Based on descending order****");
		Collections.sort(sList,(st1,st2)->{return st2.marks.compareTo(st1.marks);});
		//foreach loop
		sList.forEach(s->System.out.println(s.marks));
	}

}
