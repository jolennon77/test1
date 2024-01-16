package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookExam4_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#,##0");
		// 변수설정
		int menu = 0; // 메뉴번호
		String menuName1 = ""; // 커피
		String menuName2 = ""; // 콜라
		String menuName3 = ""; // 라떼
		String menuName4 = ""; // 녹차
		int quantity = 0; // 주문 수량
		int totalQuantity = 0; // 총주문수량
		int totalPrice = 0; // 주문금액 총 합

		while (true) {
			// 1. 메뉴 선택
			System.out.println("1. 메뉴를 선택(커피, 콜라, 라떼, 녹차)");
			menu = scanner.nextInt();

			// 2. 주문 수량
			System.out.println("주문 수량을 입력하세요: ");
			quantity = scanner.nextInt();

			int price = 0;		//선택한 메뉴의 가격 변수 초기값 스위치문으로 가격이 정해짐
			switch (menu) {
			case 1:
				price = 3500;
				break;
			case 2:
				price = 1000;
				break;
			case 3:
				price = 5500;
				break;
			case 4:
				price = 4300;
				break;

			default:
				System.out.println("올바른 메뉴를 선택하세요.");
				continue;

			} // end of switch
			totalQuantity += quantity;
			totalPrice += price * quantity;
			if (menu == 1) {
				menuName1 = "커피";

			} else {
				if (menu == 2) {
					menuName2 = "콜라";

				} else {
					if (menu == 3) {
						menuName3 = "라떼";

					} else {
						menuName4 = "녹차";

					}

				}

			}
			// 3. 계속 주문 여부 확인
			System.out.println("계속 주문하시겠습니까? (예/아니오): ");
			String answer = scanner.next();
			if (answer.equalsIgnoreCase("y")) {
				continue;

			} else if (answer.equalsIgnoreCase("n")) {
				System.out.printf("주문한 음료: %s %s %s %s\n", menuName1, menuName2, menuName3, menuName4);
				System.out.printf("주문 수량: %d잔\n", totalQuantity);
				System.out.printf("주문 금액: %s원\n", f.format(totalPrice));
				break;
			}

		} // End of while

	}// End of main
}
