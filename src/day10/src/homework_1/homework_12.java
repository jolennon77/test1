package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class homework_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정

		String tester = ""; // 시험 응시자
		int subject1_Score = 0; // 과목 1 성적 입력값
		int subject2_Score = 0; // 과목 2 성적 입력값
		String result = ""; // 결과 값

		System.out.println("이름을 입력하세요"); // 이름 입력
		tester = sc.next(); // 입력값 저장
		System.out.println("java 점수를 입력하세요"); // 자바 성적 입력
		subject1_Score = sc.nextInt(); // 입력값 저장
		System.out.println("software 점수를 입력하세요"); // 소프트웨어 성적 입력
		subject2_Score = sc.nextInt(); // 입력값 저장

		// 조건문
		if (subject1_Score >= 70 || subject2_Score >= 70) { // or 조건으로 두 과목중 하나만 참이여도 트루값을 가짐
			result = "통과";
		} else {
			result = "탈락";

		}

		// 결과 출력
		System.out.println(tester + "님의 결과는 " + result + "입니다");

	}

}