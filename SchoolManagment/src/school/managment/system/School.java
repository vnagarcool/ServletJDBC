import java.util.List;
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}
	
	/**
	 * *
	 * 
	 * @return the list of teachers int the school.
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void addTeachers(Teacher teachers) {
		Object teacher;
		teachers.add(teacher);
	}
	public List<Student> getStudents() {
		return students;
	}
	public void addStudent(Student students) {
		students.add(students);
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		this.totalMoneyEarned += MoneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneySpent-=totalMoneySpent;
	}
	
	
	
}
