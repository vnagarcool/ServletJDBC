package school.managment.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	package school.managment.system;

	public static void main(String[] args, int fees) {
		String name;
		int salary;
		int id;
		Teacher vishal = new Teacher(id:1,name"Vishal",salary:1000);
		Teacher tushar = new Teacher(id:2,name"Tushar",salary:500);
		Teacher kushal = new Teacher(id:3,name"Kushal",salary:900);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(vishal);
		Teacher kushal;
		Teacher kushal;
		teacherList.add(kushal);
		boolean add = teacherList.add(tushar);
		
		
		Student gungun = new Student(id:1,name"Gungun",grade4);
		Student rakshit = new Student(id:2,name"Rakshit",grade5);
		Student tejas = new Student(id:3,name"Tejas",grade7);
		List<Student> studentList =new ArrayList<>();
		
		studentList.add(gungun);
		studentList.add(tejas);
		studentList.add(rakshit);

		School qhs = new School(teacherList,studentList);
		System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());
		
		gungun.payFees(fees:7000);
		tejas.payFees(fees:9000);
		System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

		System.out.println("----- making SCHOOL PAY SALARY -----");
		vishal.receiveSalary(vishal.getSalary());
		System.out.println("GHS has spent for salary to " + vishal.getName()+"and now has $" +ghs.getTotalMoneyEarned());
	
		kushal.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " + kushal.getName()+"and now has $" +ghs.getTotalMoneyEarned());

		
		System.out.println(kushal);
		
		vishal.receiveSalary(vishal.getSalary());
		System.out.println(vishal);
	}

}
