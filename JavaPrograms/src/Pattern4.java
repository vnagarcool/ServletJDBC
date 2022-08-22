import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the vale of n : (rows and cols)");
			int n = scan.nextInt();
			int count = 1;
			for(int i=1;i<=n;i++) {//row
				for(int j=1;j<=n;j++) {//col
					System.out.print(count);
					System.out.print("  ");
					count++;
				}
				System.out.println();
			}
	}

}
