package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentname() {
		// TODO Auto-generated method stub
    System.out.println("Rajesh");
	}
    public void studentdept() {
		// TODO Auto-generated method stub
    System.out.println("Agri");
	}
    public void studentid() {
		// TODO Auto-generated method stub
    System.out.println("17AG036");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student Raji=new Student();
    Raji.collegename();
    Raji.collegecode();
    Raji.collegerank();
    Raji.deptname();
    Raji.studentname();
    Raji.studentdept();
    Raji.studentid();
    
	}

}
