package day3CampHomework;

public class Courses {
	private int coursId;
	private String CoursName;
	
	public Courses(int coursId, String coursName) {
		super();
		this.coursId = coursId;
		CoursName = coursName;
	}
	
	public int getCoursId() {
		return coursId;
	}
	public void setCoursId(int coursId) {
		this.coursId = coursId;
	}
	public String getCoursName() {
		return CoursName;
	}
	public void setCoursName(String coursName) {
		CoursName = coursName;
	}
}
