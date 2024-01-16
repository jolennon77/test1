package array3;

import java.util.Scanner;

public class arrayExam08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 변수 설정
		int input = 0;
		int studentCnt = 0;
		int[] score = null;
		boolean run = true;
		while (run) {

			System.out.println("=================================================================");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3.점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================================");
			System.out.println("선택");
			input = scanner.nextInt();
			if (input == 1) {
				System.out.println("학생수");
				studentCnt = scanner.nextInt();
				score = new int[studentCnt]; // 학생수 입력하면 배열 인덱스 정해짐

			} else if (input == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번째 학생 점수 입력");
					score[i] = scanner.nextInt(); // 배열에 학생 점수 담기
				}

			} else if (input == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 = " + score[i] + "점"); // 배열 출력
				}

			} else if (input == 4) {

				// 합계 및 평균 구하하기
				int sum = 0; // 합계 변수

				// 최고점 최저점 구하기
				int max = score[0];
				int min = score[0];
				for (int i = 0; i < score.length; i++) {
					if (max < score[i]) {
						max = score[i];

					}
					if (min > score[i]) {
						min = score[i];

					}
					sum += score[i];
					
				}
				double avg = (double) sum / score.length; // 평균도출

				// 4번 출력
				System.out.println("최고점수 = " + max);
				System.out.println("최저점수 = " + min);
				System.out.println("평균 = " + avg);

			} else if (input == 5) {
				run = false;
				break;

			}

		}
		System.out.println("프로그램 종료");
	}// end of main

}
