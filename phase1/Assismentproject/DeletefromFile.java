package onedemo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class DeletefromFile {
	public static void deletefromfile() {
		String path="C:\\Users\\HP\\Documents\\empty\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename to be deleted");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}


	



