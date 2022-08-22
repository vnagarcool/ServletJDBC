import java.util.ArrayList;
import java.util.Scanner;



public class HelloWorld {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("My first Project");
		
		System.out.println("Vinod Nagar developer details contact no :7976370077, email address: vnagarcool@gmail.com");
		
		try (Scanner scan = new Scanner(System.in)) {
			ArrayList<Student> someStudent = new ArrayList<Student>();
			char quit = 'Y';
			 int id,r;
			 String name;
			 float cgpa;

			 while(quit == 'Y')
			 {
			     System.out.print("\n Roll no: ");
			     id=scan.nextInt();

			     System.out.print("\n Name: ");
			     name=scan.next();

			     System.out.print("\n CGPA: ");
			     cgpa=scan.nextFloat();

			     someStudent.add (new Student(id, name, cgpa));
			     System.out.print(" Enter Another Record? (Y/N)");
			     String word = scan.next();
			     word = word.toUpperCase();
			     quit= word.charAt(0);
			     //scan.close();   
			     
			 }

			 for(Student student:someStudent)
			 {
			     System.out.println(student.id);
			     System.out.println(student.name);
			     System.out.println(student.cgpa);
			 }
			 
			 
			 System.out.print("\n search is available no: ");
			 int index1 = scan.nextInt();
			 System.out.print("\n search is not available: ");
			 int index2 = scan.nextInt();
			 int ex1 = someStudent.indexOf(index1);
			 int ex2 = someStudent.indexOf(index2);
			 if(ex1 == -1)
			    System.out.println("The element is not in the ArrayList");
			 else
			    System.out.println("The element is in the ArrayList at index " + index1);
			 if(ex2 == -1)
			    System.out.println("The element is not in the ArrayList");
			 else
			    System.out.println("The element is in the ArrayList at index " + index2);
			 
			 
			 
			 System.out.print("\n specified no: ");
			 int index = scan.nextInt();
			 someStudent.remove(index);
			 
			 for(Student student:someStudent)
			 {
			     System.out.println(student.id);
			     System.out.println(student.name);
			     System.out.println(student.cgpa);
			 }
		}
	     
	 }
	
	     
}
