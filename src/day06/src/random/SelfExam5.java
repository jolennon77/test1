

package random;

import java.util.Scanner;


public class SelfExam5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
	
		
		String indentifyNumString = "";	//주민번호
		char num = ' ';					//식별문자
		String resultString = ""; 		//결과
		String resultString1 = ""; 		//결과
		
		
		
		System.out.println("주민번호 입력하세요");
		indentifyNumString = scan.next();
		
		num = indentifyNumString.charAt(7);
		
		
//		System.out.println(num);
		if (num == '1' || num == '3') { resultString = "당신의 성별은 남자입니다.";
			
		} else {resultString = "당신의 성별은 여입니다.";
			
		}
		
		System.out.println(resultString);

		switch (num) {
		case '1','3': resultString1 = "당신의 성별은 남자입니다.";
			
			break;

		case '2','4': resultString1 = "당신의 성별은 여입니다.";
			
			break;
		
		default:
			break;
		}
		
		System.out.println(resultString1);
	}

}

