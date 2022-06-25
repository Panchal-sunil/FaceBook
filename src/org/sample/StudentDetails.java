package org.sample;

public class StudentDetails extends HostelDetails {

	private void stdId() {
		// TODO Auto-generated method stub

		System.out.println("Student Id :- 12345");
		
	}
	private void stdName() {
		// TODO Auto-generated method stub

		System.out.println("Student Name :- Sunil");
	}
	private void stdCourse() {
		// TODO Auto-generated method stub

		System.out.println("student Course :- B.com");
	}
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails();
		s.clgName();
		s.clgAddress();
		s.clgCourses();
		s.stdId();
		s.stdName();
		s.stdCourse();
		s.hstlNo();
	}
}
