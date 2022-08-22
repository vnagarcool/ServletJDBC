
public class Program6Conditions {

	public static void main(String[] args) {
		int age = 12;
		if(age>18)
		{
			System.out.println("Liable to get driving license");
		}
		else if (age==18) //control comes here if condition-1 fails
		{
			System.out.println("Liable to apply for driving license");
		}
		else //control comes here if condition-1 & condition-2 fails
		{
			System.out.println("Not Liable to get driving license");
		}
	}

}
