package homework_1;

import java.util.Scanner;

public class homework_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정
		int num = 0; // 숫자 입력값
		String result = ""; // 결과 값

		System.out.println("숫자를 입력 하세요"); // 수입력
		num = sc.nextInt(); // 입력값 저장

		if (num % 2 != 0) { // 2로 나눌시 나머지가 0이 아니면 ==홀수

			result = "A 팀"; // 트루(홀수)일시 결과에 A값 저장

		} else {

			result = "B 팀"; // 아닐경우 결과에 B값 저장

		}

		// 결과 출력
		System.out.println(result);

	}

}