package homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class homework_47 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 배열 생성
		String[] names = new String[3]; // 스트링값(학생이름) 3개을 담을 수 있는 배열생성
		int[] scores = new int[3]; // 인트값(점수) 3개을 담을 수 있는 배열생성
		int sum = 0; // 점수의 합 변수
		int avg = 0; // 평균 변수

		// 입력 요청

		for (int i = 0; i < scores.length; i++) {
			System.out.print("이름입력>>");
			names[i] = scanner.nextLine();

			System.out.print("성적입력>>");
			scores[i] = Integer.parseInt(scanner.nextLine());
		}

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i]; // score[0] ~ scores[2] 합 반복문으로 변수 저장
		}

		avg = sum / scores.length; // 평균 계산식

//출력

		for (int i = 0; i < scores.length; i++) {

			System.out.println("----------------");
			System.out.println("학생이름 : " + names[i]);
			System.out.println("성    적 : " + scores[i]);
		}

		System.out.println("평    균 : " + avg);
	} 

}