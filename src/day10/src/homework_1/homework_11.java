package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class homework_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정

		String tester = ""; // 시험 응시자

		int kor_Score = 0; // 국어 시험 성적 입력값
		int eng_Score = 0; // 영어 시험 성적 입력값
		int math_Score = 0; // 수학 시험 성적 입력값
		String result = ""; // 결과 값

		System.out.println("이름을 입력하세요"); // 이름 입력
		tester = sc.next(); // 입력값 저장
		System.out.println("국어 성적을 입력하세요"); // 국어 성적 입력
		kor_Score = sc.nextInt(); // 입력값 저장
		System.out.println("영어 성적을 입력하세요"); // 영어 성적 입력
		eng_Score = sc.nextInt(); // 입력값 저장
		System.out.println("수학 성적을 입력하세요"); // 수학 성적 입력
		math_Score = sc.nextInt(); // 입력값 저장

		// 조건문
		if (kor_Score >= 60 && eng_Score >= 60 && math_Score >= 60) { // and 조건으로 세과목 모두 60 이상이여야 트루값
			result = "통과";
		} else {
			result = "탈락";

		}

		// 결과 출력
		System.out.println(tester + "님의 결과는 " + result + "입니다");

	}

}