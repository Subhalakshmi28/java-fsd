package onedemo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Createnewfile {
	public  void AddFile() throws IOException {
		String path="C:\\Users\\HP\\Documents\\empty\\";
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//create a new file
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("file not created");
		}
		else {
			System.out.println("file created");
		}
		
	}

	}