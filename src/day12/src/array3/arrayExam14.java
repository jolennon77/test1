package array3;

import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class arrayExam14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정
		boolean run = true;
		int beverNum = 0; // 음료 번호
		int orderCnt = 0; // 주문 수량
		String[] beverName = { " ", "아메리카노", "라떼", "콜라", "홍차" };
		int beverPrice[] = {0, 2500, 4500, 1500, 5500};
		
		int totalPrice = 0;
		
		
		
		String[] result = null;

		while (run) {
			System.out.println("음료 번호를 선택하세요....\n1.아메리카노(2500) | 2.라떼(4500)| 3.콜라(1500) | 4.홍차(5500) | 0.주문 취소 ");
			beverNum = sc.nextInt();

			System.out.println("주문 수량을 입력");
			orderCnt = sc.nextInt();

			
			
			System.out.println("주문을계속 하시겠습니까?");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("y")) {
				continue;

			} else {
				System.out.println("주문을 종료 합니다.");
				run = false;
			}
		}

	}// end of main
}