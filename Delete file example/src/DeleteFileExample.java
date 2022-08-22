import java.io.File;
public class DeleteFileExample {

	public static void main(String[] args) {
File f = new File("E:\\IOPrograms\\Vinod.txt");
		
		if(f.delete()==true) {
			System.out.println("file deleted successfully");
		}
		else {
			System.out.println("File deletion failed");
		}
		
		System.out.println("Can it execute :"+ f.canExecute());
		System.out.println("Can it read :"+ f.canRead());
		System.out.println("Can it write :"+ f.canWrite());
		System.out.println("Does it exist :"+ f.exists());
		System.out.println("its absolute path :"+ f.getAbsolutePath());
		System.out.println("its free space :"+ f.getFreeSpace());
		System.out.println("its name:"+ f.getName());
		System.out.println("its parent:"+f.getParent());
		System.out.println("its path:"+f.getPath());
		System.out.println("is it a directory: "+f.isDirectory());
		System.out.println("is it a file: "+f.isFile());
	}
}
