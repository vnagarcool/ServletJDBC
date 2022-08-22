package lockedMe;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.*;

 // FileFilter
class MyFilenameFilter implements FilenameFilter{
	
	String initials;
	

	public MyFilenameFilter(String fileSearch) {
		// TODO Auto-generated constructor stub
	}

	//constructor to initialize object
	public void MyfilenameFilter(String initials)
	{
		this.initials = initials;
	}
	
	public boolean accept(File dir, String name)
	{
		return name.startsWith(initials);
	
	}
}
public class Operations {

	private static String mainPath = "E:\\Main Project";
			
			//Adding File 
			public static void addFile(){
				Scanner sc = new Scanner(System.in);
				String fileToAdd = sc.nextLine();
				
				File absolutePath = new File(mainPath+"/"+fileToAdd+".txt");
				
				if(absolutePath.exists()) {
					System.out.println("File Already Exists");
					mainfile.selectOptions();
				}else {
					try {
						System.out.println("File Created");
						absolutePath.createNewFile();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}
			//Removing File 
	public static void remove() {
		Scanner sc = new Scanner(System.in);
		String fileRemove = sc.nextLine();
		
		File file = new File(mainPath+"/"+fileRemove+".txt");
		
		if(file.delete()) {
			System.out.println("File deleted " + fileRemove);
		}else {
			System.out.println("File not found");
		}
	}


    // Searching File 
public static void searchFile() {
	Scanner sc = new Scanner(System.in);
	String fileSearch = sc.nextLine();
	
	File dir = new File(mainPath);
	MyFilenameFilter filter = new MyFilenameFilter(fileSearch);
	String[] fileIn = dir.list(filter);
	
	if(fileIn == null) {
		System.out.println("File Not Found");
	}
	else {
		for(int i=0; i < fileIn.length; i++)
			System.out.println(fileIn[i] + " File found successfully");
		}
	};
}
