package lockedMe; 

import java.io.IOException;


public class mainfile {

	public static void main(String[] args) throws IOException {
		HandleFiles.welcomeScreen();
			
		}
		public static void selectOptions() {
			String[] arr = {
					"1. Add a file",
					"2. Delete a file",
					"3. Search a file",
					"4. Exit a file",
			};
			
			int[] arr1 = {1,2,3,4};
			
			for(int i=0; i < arr1.length; i++) {
				System.out.println(arr[i]);
			};
		}
	}
