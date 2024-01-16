package array3;

import java.util.Scanner;

public class arrayExam09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int studentCnt = 0;
		int[] score = null;

		while (true) {		
			printMenu();								//메뉴 출력 메소드
			input = scanner.nextInt();

			switch (input) {							//메뉴 출력 번호에 따른 스위치문
			case 1:
				studentCnt = inputStudentCount(scanner);	//학생수 입력 메소드
				score = new int[studentCnt];				//메소드에서호출된 학생수 변수 배열의 인덱스로 담음
				break;
			case 2:
				inputStudentScores(scanner, score);			//학생 점수 입력 메소드
				break;
			case 3:
				printStudentScores(score);					//학생 점수 출력 메소드
				break;
			case 4:
				analyzeScores(score);						//학생 점수 분석 메소드
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("올바른 메뉴를 선택하세요.");
			}
		}
	}

	// 메뉴 출력
	private static void printMenu() {
		System.out.println("=================================================================");
		System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
		System.out.println("=================================================================");
		System.out.println("선택");
	}

	// 학생 수 입력
	private static int inputStudentCount(Scanner scanner) {
		System.out.println("학생 수 입력");
		return scanner.nextInt();
	}

	// 학생 점수 입력
	private static void inputStudentScores(Scanner scanner, int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 학생 점수 입력");
			score[i] = scanner.nextInt();
		}
	}

	// 학생 점수 출력
	private static void printStudentScores(int[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번 학생 점수 = " + score[i] + "점");
		}
	}

	// 점수 분석
	private static void analyzeScores(int[] score) {
		int sum = 0;
		int max = score[0];
		int min = score[0];

		for (int i : score) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
			sum += i;
		}
		double avg = (double) sum / score.length;
		System.out.println("최고점수 = " + max);
		System.out.println("최저점수 = " + min);
		System.out.println("평균 = " + avg);
	}
}