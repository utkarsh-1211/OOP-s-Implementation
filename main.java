package com.oopslearning.www;

public class main {
  public static void main(String[] args) {
	
//	Encapsulation e1 = new Encapsulation("Utkarsh", 678906);
//	
//	e1.getAccountno(678906);
	  
	  Student s1 = new Student();
	  Student s2 = new Student("Utkarsh");
	  Student s3 =new Student("Som", 23);
	  Student s4 = new Student("Sahil", 24, 38);
	  Student s5 = new Student("Kastub", 34, 48, "LNCT");
	  
	  System.out.println(s1.name);
	  System.out.println(s1.age);
	  System.out.println(s1.rollNumber);
	  System.out.println(s1.collage);
	  
	
  }
} 
