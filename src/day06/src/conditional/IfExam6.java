package conditional;

import java.util.Scanner;

public class IfExam6 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		String numString = "";
		String gender =" ";
		char num = ' '; // char 형이라 ''; 는 에러 ' '; 라 입력 해야함.
		
		
		System.out.println("주민번호 입력");
		numString = scanner.nextLine();
		num = numString.charAt(7);
		
		//	 numString.charAt(7)	문자열을 char 문자 배열로 변환 하여 () 번째 문자 선택
		//							char 라서 비교 할때 쌍따옴표가아닌 ''따옴표 사
		
		
		if (num == '1' || num == '3' ) { gender = "남성";
			
		} else {if (num == '2' || num == '4' ) { gender = "여성";
		
		}
			
		}
		
		System.out.println(gender);
		
	}
}
