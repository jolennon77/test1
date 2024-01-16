package array3;

import java.util.Scanner;

public class arrayExam10 {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int input = 0;
		int studentCnt = 0;
		int[] score = null;
		boolean run = true;
		
		while (run) {
			printMenu(); // 메뉴 출력 메소드
			input = scanner.nextInt();

			if (input == 1) {
				studentCnt = inputStudentCount(scanner); // 학생수 입력 메소드
				score = new int[studentCnt]; // 메소드에서 호출된 학생수 변수가 배열의 인덱스로 담김

			} else if (input == 2) {

				inputStudentScores(scanner, score); // 학생 점수 입력 메소드

			} else if (input == 3) {

				printStudentScores(score); // 학생 점수 출력 메소드

			} else if (input == 4) {

				analyzeScores(score); // 학생 점수 분석 메소드

			} else if (input == 5) {

				System.out.println("프로그램 종료");
				run = false;	//불린 변수가 있는 경우 와일문 끝까지 일단 실행 후 와일문을 중지
//				break;	// if문에 있는 break는 if문을 감싸고 잇는 반복문을을 빠져나감
			}
			//ex )while 문에 내용이 있는경우
			//boolean = 실행됨
			//break = 실행안됨
		}
	}

	// 메뉴 출력 메소드
	private static void printMenu() {
		System.out.println("=================================================================");
		System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
		System.out.println("=================================================================");
		System.out.println("선택");
	}

	// 학생 수 입력 메소드
	private static int inputStudentCount(Scanner scanner) {
		System.out.println("학생 수 입력");
		return scanner.nextInt();
	}

	// 학생 점수 입력 메소드
	private static void inputStudentScores(Scanner scanner, int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생 점수 입력");	
			score[i] = scanner.nextInt();
		}
	}

	// 학생 점수 출력 메소드
	private static void printStudentScores(int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번 학생 점수 = " + score[i] + "점");
		}
	}

	// 점수 분석 메소드
	private static void analyzeScores(int[] score) {
		int sum = 0;
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (i > max) {
				max = score[i];
			}
			if (i < min) {
				min = score[i];
			}
			sum += score[i];
		}
		double avg = (double) sum / score.length;
		System.out.println("최고점수 = " + max);
		System.out.println("최저점수 = " + min);
		System.out.printf("평균 =%.2f\n", avg);
	}
}