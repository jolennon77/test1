package random;

import java.util.Scanner;

public class SelfExam3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int num=0;
		String Result = "";
		
		System.out.println("번호 입력");
		num = scan.nextInt();
		
		
		
		if (num%2==0) { Result = "A class";
			
		}else { Result = "B class";
			
		}
		
		System.out.println(Result);
		
		
		int numRemain = num%2;
		String Result2 = "";
		
		switch (numRemain) {
		case 0: Result2 = "A class";
			
			break;

		default: Result2 = "B class";
			break;
		}
		
		System.out.println(Result2);
		
		
	}

}
