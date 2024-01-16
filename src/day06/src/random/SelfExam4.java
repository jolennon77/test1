package random;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class SelfExam4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int num = 0; // 구매수량
		final int PRICE = 4500;
		String answer = "";
		String result = "";
		String result1 = "";
		
		
		System.out.println("구매수량 입력");
		num = scan.nextInt();

		int totalPrice = num * PRICE;
		
		System.out.println("영수증 필요? y/n");
		answer = scan.next();
		
		
		
		if (answer.equals("y")) { result = "금액은 "+totalPrice+"입니다."+"\n"+"영수증을 출력합니다.";
			
		} else { result = "금액은 "+totalPrice+"입니다."+"\n"+"영수증을 생략합니다.";
			
		}
		
		
		System.out.println(result);
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println();

		
		switch (answer) {
		case "y":result1 = "금액은 "+totalPrice+"입니다."+"\n"+"영수증을 출력합니다.";
			
			break;

		default:result1 = "금액은 "+totalPrice+"입니다."+"\n"+"영수증을 생략합니다.";
			break;
		}
		System.out.println(result1);
		
	}

}