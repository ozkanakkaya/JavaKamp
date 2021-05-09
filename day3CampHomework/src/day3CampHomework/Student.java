package day3CampHomework;

public class Student extends User {
	private Courses[] takenCourses;

	public Courses[] getTekenCourses() {
		return takenCourses;
	}

	public void setTekenCourses(Courses[] takenCourses) {
		this.takenCourses = takenCourses;
	}
}
