package homework_1;

import java.util.Scanner;

public class homework_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정
		int testScore = 0; // 시험 성적 입력값
		String result = ""; // 결과 값

		System.out.println("성적을 입력하세요"); // 성적 입력
		testScore = sc.nextInt(); // 입력값 저장

		// 조건문
		if (testScore >= 80) { // 성적이 80보다 크면
			result = "합격"; // 합격값 저장
		} else {
			result = "불합격"; // 그렇지 않으면 불합격 값 저장

		}

		// 결과 출력
		System.out.println(result);

	}

}