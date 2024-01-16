package bookexam;

import java.util.Scanner;


public class Exam22 {
	public static void main(String[] args) {
		
		
				
			Scanner scan = new Scanner(System.in);
			
			System.out.println("아이디:");
			String nameString = scan.nextLine();
			
			System.out.println("패스워드:");
			int intPassword = scan.nextInt();
			
			if (nameString.equals("java") && (intPassword == 12345)) 
					{System.out.println("scesses");} 
			else 
			{
				System.out.println("faile incorrect ID");
			}
	}	

	

}