package kodlamaIO;

public class Product {
	
	public Product(int id, String courseName,int finishingPercent, String teacherName) {
		
		this.id=id;
		this.courseName=courseName;
		this.finishingPercent=finishingPercent;
		this.teacherName=teacherName;
	}
	
	int id;
	String courseName;
	int finishingPercent;
	String teacherName;
}
