package array3;

import java.util.Scanner;

import javax.security.auth.callback.ConfirmationCallback;

public class arrayExam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 수입력 받기
		System.out.println("수입력");
		int num = sc.nextInt();

		// 행과 열에 값을 쓰기 위한 변수 선언
		int value = 1;

		for (int i = 0; i < num; i++) { // 행방향 출력 결
			System.out.print((i + 1) + "=> "); // 줄 바꿈 안함

			for (int j = 0; j < num; j++) { // 열 방향 출력을 결정
				System.out.printf("%4d", value);
				value += num; // 입력 받은 숫자 만큼 증가
			} // end of inner for
			System.out.println(); // 줄바꿈
		} // end of outer for
		System.out.println();
	} // end of main

}
