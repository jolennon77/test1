package bookexam;

import java.util.Scanner;

public class Exam21 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("첫번째수");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째수");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		
		System.out.println("덧셈 결과 :" + result);
		
		
		
		
		
	//System.out.println("덧샘 결과:" + result);
		
		
System.out.println();
System.out.println("Q3-------------------------------------------");
System.out.println();
	
		
		
	Scanner scanner1 = new Scanner(System.in);
//	
//	String nameString = "";
//	String idString = "";
//	String phoneNumberString = "";
//	
	
	
	
	System.out.println("[필수 정보 입력]");
	
	System.out.print("1. 이름 : ");
	String nameString = scanner1.nextLine();
	
	
	System.out.print("2. 주민번호 앞 6자리 : ");
	String idString = scanner1.nextLine();
	
	
	System.out.print("3. 전화번호 : ");
	String phoneString = scanner1.nextLine();
	
	
	
	
		
	
	
	
	
	//int id = Integer.parseInt(idString);
	//int phone = Integer.parseInt(phoneString);
	
		
	}

}
