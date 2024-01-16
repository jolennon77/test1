package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SwicthExam2 {

	public static void main(String[] args) {

	
		
		DecimalFormat f = new DecimalFormat("#,##0원");
		Scanner scanner = new Scanner(System.in);
		
		
		
		int productNum = 0; 		// 음료번호
		String beverage = "";		// 음료이름
		
		int price = 0; 				// 음료가격
		int orderNum = 0; 			// 주문수량
		
		
		System.out.println("주문할 음료를 선택하세요"+"\n"+"[1.커피 2.라떼 3.콜라 4.녹차]");
		productNum = scanner.nextInt();
		
		System.out.println("주문 수량을 선택하세요");
		orderNum = scanner.nextInt();
		
		switch (productNum) {
		case 1:
			beverage = "커피";
			price = 3500;
		break;
		case 2:
			beverage = "라떼";
			price = 5500;	
		break;
		case 3:
			beverage = "콜라";
			price = 1500;
		break;
		case 4:
			beverage = "녹차";
			price = 3500;
		break;
		default: beverage = "오류";
			break;
		}
		
		
		
		
		System.out.println("주문한 음료 : "+beverage);
		System.out.println("주문 수량 : "+orderNum);
		System.out.println("결제 금액 : "+ f.format(orderNum*price));
		System.out.printf("\n주문한 음료 : %s\n주문 수량 : %d\n결제 금액 : %s", beverage,orderNum,f.format(orderNum*price));
		
		
		
	}
}
