package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileappand {
	public static void main(String[] args) throws IOException {
		File myFile=new File("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\Project2\\src\\file\\prime.txt");
		
		FileWriter fr1=new FileWriter(myFile,true);//Appending..
	fr1.write("Are you fine");
	fr1.flush();
	System.out.println(myFile);
  System.out.println("The new line is appended");
		
	
	
	}

}
	


