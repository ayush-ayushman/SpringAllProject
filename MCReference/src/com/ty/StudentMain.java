package com.ty;

public class StudentMain {
	public static void main(String[] args) {
		StudentInterface st=Student::new;
		Student stu=st.getStudent();
		stu.display();
	}

}
