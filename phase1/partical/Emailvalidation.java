package email;

import java.util.Scanner;

public class Emailvalidation {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String array[] = {"dome@gmail.com" ,"maxy@gmail.com","alexya@yahoo.com"};
		boolean found = false;
		System.out.println("Enter a email id:");
		String name = sc.next();
		sc.close();
		for (int i=0; i < array.length; i++)
		{
			if (array[i].equals(name))
			{
				System.out.println('\n');
				System.out.println("Email id which is entered by you is found");
				found = true;
				break;
			}
		
		}
		if(found==false)
			System.out.println("Email id which is entered by you is not found");
		
	}


}



