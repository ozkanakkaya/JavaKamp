package day3CampHomework;

public class Main {

	public static void main(String[] args) {
		
		Courses courses1=new Courses(1,"C#-Angular");
		
		Courses courses2=new Courses(2,"Java-React");

		
		
		Student student=new Student();
		student.setId(1);
		student.setUserName("ozkky");
		student.setPassword("123");
		student.setFirstName("Özkan");
		student.setLastName("Akkaya");
		student.setTekenCourses(new Courses[] {courses1,courses2});
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setUserName("engindemirog");
		instructor.setPassword("1234");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGivenCourses(new Courses[] {courses1});
		
		UserManager userManager=new UserManager();
//		userManager.add(student);
//		userManager.add(instructor);
		
		User[] users= {student,instructor};
		userManager.addMultiple(users);

		StudentManager studentManager=new StudentManager();
		studentManager.add(student.getUserName(), student.getTekenCourses());
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor.getUserName(),instructor.getGivenCourses());
		
	}

}
