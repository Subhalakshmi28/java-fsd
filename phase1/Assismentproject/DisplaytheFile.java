package onedemo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class DisplaytheFile {
	public void DisplaytheFile() throws IOException {
		String path="C:\\Users\\HP\\Documents\\empty";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to display");
		String filename=sc.next();
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}





