package file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {
	public static void main(String[] args) throws IOException {
		File myFile=new File("C:\\Users\\HP\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\Project2\\src\\file\\prime.txt");
	// Creating a file
		     if(myFile.createNewFile())
			{
				System.out.println("File is created");
			}
		
		// Writing in a file
		System.out.println("Writing content in a file");
		String data="Hello....";
		
			FileWriter fw = new FileWriter(myFile);
			fw.write(data);
			fw.flush();
			System.out.println(data);
			System.out.println("The content is written");
		} 
	}
	


