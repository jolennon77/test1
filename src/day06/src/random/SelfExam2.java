package random;

import java.util.Scanner;

public class SelfExam2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int num = 0;
		
		System.out.println("숫자 입력");
		num = scan.nextInt();
		int result = 0;
		if (num%2 == 0 || num%3 == 0) { result = num + 1000;
			
		} else { result = num + 5000;

		}
	
		
		
		
		System.out.println(result);
		
//		remain = num%2 || num%3;
		
		
				
//		
//		switch (remain) {
//		case 0: result = num+1000;
//			
//			break;
//
//		default:
//			break;
//		}
//		
//	switch 문으로 할수가 없다!		
		
		
	}

}
