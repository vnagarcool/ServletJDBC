/*
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 1 0 1 0 1
 */
import java.util.Scanner;
public class pattern1 {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the vale of n : (rows and cols)");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {//row
			for(int j=1;j<=n;j++) {//col
				//modulus operation 
				if((i % 2) == 0)
						{
					//Even col captured
					System.out.println("0 ");
				}
				else {
					//odd col captured 
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}
