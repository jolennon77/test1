package array3;

import java.util.Scanner;

public class arrayExam13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 음료 정보 배열 초기화
		String[] drinks = { "", "아메리카노", "라떼", "콜라", "홍차" };
		int[] prices = { 0, 2500, 4500, 1500, 5500 };
		int[] orderCnt = { 0, 0, 0, 0, 0 }; // 주문 정보(수량) 저장 배열

		// 주문 프로세스 시작
		// start of while
		while (true) {
			// 메뉴 출력
			System.out.println("음료 번호를 선택하세요....\n1.아메리카노(2500) | 2.라떼(4500)| 3.콜라(1500) | 4.홍차(5500) | 0.주문 취소 ");
			int choice = scanner.nextInt(); // 음료 선택

			System.out.print("주문 수량을 입력하세요: "); // 주문 수량 입력
			int quantity = scanner.nextInt();

			orderCnt[choice] += quantity; // 주문 정보 저장 여기에는 주문 수량이 누적됨

			// 계속 주문할지 여부 확인
			System.out.print("주문을 계속하시겠습니까? (y / n): "); // y 일경우 와일문 반복
			String answer = scanner.next(); // n 일결우 와일문 빠져나가고 주문결과 출력

			if (answer.equalsIgnoreCase("n")) {
				break;
			}
		} // end of while

		// 주문 결과 출력
		System.out.println("\n===================================");
		for (int i = 0; i < drinks.length; i++) {
			if (orderCnt[i] > 0) { // 음료가 0이상이라는 것은 주문이 1개라도 들어간 값들을출력
				System.out.printf(drinks[i] + "\t\t" + orderCnt[i] + "잔 주문" + (orderCnt[i] * prices[i]) + "");
			}
		}

	}
}