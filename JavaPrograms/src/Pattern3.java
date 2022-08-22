import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the value of row and colum (row==col): ");
		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			for (int i=1; i<=n; ++i)
			{
				for(int j=n;j>=i;j--)
			{
					System.out.print("- ");
				}
				for(int j=1;j<=(2*i)-1;j++)//5,4,3,2,
				{
						System.out.print("* ");
					}
			}
				System.out.println();
				}
			}
		
	

