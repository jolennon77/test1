package homework_1;

import java.util.Scanner;

public class homework_45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; 											// 사용자입력 변수
		int count = 0; 											// 시도횟수를 세기위한 변수

		do {

			count++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			input = sc.nextInt(); 								// 입력받은 값을 변수 input에 저장한다.

			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (answer == input) {
				System.out.println("정답!");
				System.out.println("시도 횟수 : " + count);
				break;

			} else {
				System.out.println("더 작은 수를 입력하세요");
				
			}

		} while (true); // 무한반복문

	}

}
