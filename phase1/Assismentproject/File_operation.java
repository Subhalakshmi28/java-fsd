package onedemo;
import java.io.IOException;
import java.util.Scanner;
public class File_operation {
         public static void main(String[] args) throws IOException {
	      Scanner sc=new Scanner(System.in);
	      Createnewfile cf=new Createnewfile();
	      DisplaytheFile df=new DisplaytheFile();
	      SearchtheFile sf=new SearchtheFile();
	      DeletefromFile delf=new DeletefromFile();
	      while(true) {
	      System.out.println("Enter your options 1.Display the Files 2.Operations 3.close");
	      int option1=sc.nextInt();
	      switch(option1)
	          {
	    	  case 1:
	    		  df.DisplaytheFile();  
	    		  break;
	    	  case 2:
	    		  int temp=1;
	    	    while(temp==1) { 
	    		  
    		  System.out.println("Select Your options 1.Add a New File 2.Search the File 3.Delete the File  4.Exit");
	    		int option2=sc.nextInt(); 
	    		  switch(option2)
	    		  {
	    		  case 1:cf.AddFile();
	    		  break;
	    		  case 2: sf.Searchthefile();
	    		  break;
	    		  case 3: delf.deletefromfile();
	    		  break;
	    		  case 4:temp=0;
	    		         break;
	    		  default: 
	    			  System.out.println("Invalid option");
	    		      break;
	    		  }
	    	  }while(temp==1);
	    	   break;
	    	  case 3:
	    		  System.exit(0); 
	    	       break;
	    	  default: 
	    		  System.out.println("Invalid option");
	    	  break;
	    	  }
	      }
}
}
