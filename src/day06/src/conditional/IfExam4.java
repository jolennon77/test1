package conditional;

import java.util.Scanner;


public class IfExam4 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		
		
		
		int amount = 0, num=0;
		final int PRICE = 4500; 			// 상수의 변수명은 대문자로 쓰는게 관례
		
		
		
		
		System.out.println("수량입력");
		amount = scanner.nextInt();

		num = amount * PRICE;

		
		System.out.println("영수증이 필요한가요? y/n");
		String result = scanner.next();
		
		
		//	변수.equals(""); = > 문자열 변수와 ""이 같은지 비교(대소문자 구분)
		//	변수.equalsIgnoreCase(""); = > 문자열 변수와 ""이 같은지 비교(대소문자 구분 안함)
		
		
		result.equalsIgnoreCase("y");
		
		if (result.equalsIgnoreCase("y")) { System.out.println("금액은" + num+"입니다."+ "\n영수증 여기 있습니다.");
			
		} else {
			if (result.equalsIgnoreCase("n")) { System.out.println("금액은" + num+"입니다."+ "\n영수은 없습니다.");
		} else {System.out.println("올바른 명령어를 입력하세요.");
			
		}
	
		}

	}
}
