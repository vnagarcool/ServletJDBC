import java.util.Scanner;

public class Primefactor {
	private static String i;

	private static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int count = 0;
		for(int i=2;i<=(number);i++) {
			count =0;
			while(number %i==0) {
				number/=i;
				count++;
				if(count==0) {
					continue;
				}
			}
	}
		System.out.println(i+ "**"+count);

	}
}
