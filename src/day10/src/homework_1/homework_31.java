package homework_1;

import java.util.Scanner;

public class homework_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int amount = 0; // 수량
		int price = 4500; // 가격
		int totalPrice = 0; // 총 가격
		String result = ""; // 결과 변수

		System.out.println("수량입력");
		amount = sc.nextInt();

		totalPrice = amount * price; // 총가격

		// 조건문 반복문
		while (true) {
			System.out.println("영수증이 필요한가요? y/n");
			String answer = sc.next(); // 응답 변수

			if (answer.equalsIgnoreCase("y")) {
				result = "금액은" + totalPrice + "입니다." + "\n영수증 여기 있습니다.";
				break; // 응답 y ->반복문 종료
			} else if (answer.equalsIgnoreCase("n")) {
				result = "금액은" + totalPrice + "입니다." + "\n영수은 없습니다.";
				break; // 응답 n ->반복문 종료
			} else {
				System.out.println("올바른 명령어를 입력하세요.");// y 나 n 가 아닐시 출력
				continue; // y 나 n 가 아닐시 반복문 다시 실행
			}

		}
		// 결과 출력
		System.out.println(result);

	}

}
