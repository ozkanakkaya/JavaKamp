package day3CampHomework;

public class Instructor extends User {
	private Courses[] givenCourses;

	public Courses[] getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(Courses[] givenCourses) {
		this.givenCourses = givenCourses;
	}
}
