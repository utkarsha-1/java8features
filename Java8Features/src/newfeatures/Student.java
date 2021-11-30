package newfeatures;

public class Student {
	Integer rollNumber;
	String name;
	Double marks;

	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}

	public Student(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	

}
