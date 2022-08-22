
public class Program7Conditions2 {

	public static void main(String[] args) {
		int age = 19;
		int amt = 200;
		
		if(age>18)
		{
			if(amt==2000)
			{
				System.out.println("Issue license");
			}
			else if(amt>2000)
			{
				System.out.println("Please collect the change");
			}
			else
			{
				System.out.println("Amount not paid");
			}
		}
		else {
			System.out.println("Not eligible to get license");
		}
	}

}
