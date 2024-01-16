package homework_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class homework_32 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			DecimalFormat f = new DecimalFormat("#,##0");

			// 메뉴 정보 배열
			String[] menuNames = { "", "커피", "콜라", "라떼", "녹차" };

			// 변수 설정
			int totalQuantity = 0; // 총주문수량
			int totalPrice = 0; // 주문금액 총 합

			while (true) {
				// 1. 메뉴 선택
				System.out.println("1. 메뉴를 선택(커피, 콜라, 라떼, 녹차)");
				int menu = scanner.nextInt();

				// 2. 주문 수량
				System.out.println("주문 수량을 입력하세요: ");
				int quantity = scanner.nextInt();

				int price = 0; // 선택한 메뉴의 가격 변수 초기값 스위치문으로 가격이 정해짐
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
				}

				// 주문 처리
				totalQuantity += quantity;
				totalPrice += price * quantity;

				// 3. 계속 주문 여부 확인
				 System.out.println("계속 주문하시겠습니까? (예/아니오): ");
		            String answer = scanner.next();
		            if (answer.equalsIgnoreCase("n")) {
		                // 주문 완료 시 출력
		                System.out.print("주문한 음료: ");
		                for (int i = 1; i < menuNames.length; i++) {
		                    if (totalQuantity > 0) {
		                        System.out.print(menuNames[i] + " ");
		                        totalQuantity--;
		                    }
		                }
		                System.out.println();
		                System.out.printf("주문 수량: %d잔\n", totalQuantity + quantity); // 수정된 부분
		                System.out.printf("주문 금액: %s원\n", f.format(totalPrice));
		                break;
		            }
		        } // End of while
		    }// End of main
		}