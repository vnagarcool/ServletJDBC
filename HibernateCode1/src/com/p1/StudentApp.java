package com.p1;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("vinod");
		
		HibernateManager hbm = new HibernateManager();
		//hbm.saveObj(s1);
		hbm.getAll();
		System.out.println("-------------");
		hbm.getSpecific(2);
		System.out.println("-------------");
		//hbm.updateDate("kushal", 1);
		hbm.deleteData(1);
		System.out.println("-------------");
		hbm.getAll();
	}
}
