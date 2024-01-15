package array2;

import java.util.Scanner;

public class Array2Exam02 {

	public static void main(String[] args) {

//		-변수 설정 방법1-
//		int score[] = new int[5];
//		score[0] = 100;
//		score[1] = 99;
//		...
//		-변수 설정 방법2-

		int[ ]score = new int[] { 100, 88, 100, 90, 50 };
		String studentNames[] = { "홍길동", "김자바", "이자바", "박디비", "송디비" };
//		-변수 설정 방법3-		
//		int score[] = new int[5];
//		String studentNames[] = new String[5];
//		

		int sum = 0;
		double avg = 0;
		int count = 0;

		int max = score[0];
		int min = score[0];

//입력 받기
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < studentNames.length; i++) {
//			System.out.println("이름 입력");
//			studentNames[i] = scanner.nextLine();
//			
//			System.out.println("성적 입력");
//			score[i] = Integer.parseInt(scanner.nextLine());
//			
//			
//		}
		
		
		System.out.println("=================================================");
		System.out.println("번호\t이름\t\t점수\t");
	
		
//학생별 점수 번호 이름 출력 조건문		
		for (int i = 0; i < score.length; i++) {

			sum += score[i];
			count++;
			System.out.println((i + 1) + "\t" + studentNames[i] + "\t\t" + score[i]);

		}
//최대값 최소값 구하는 조건문
		for (int i = 0; i < score.length; i++)
			if (max < score[i]) {
				max = score[i];

			} 
		for (int i = 0; i < score.length; i++)
			if (min > score[i]) {
				min = score[i];

			}
//종합 출력 
		System.out.println("=================================================");

		avg = (double) sum / score.length;

		System.out.println("인원수 : " + count);
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);

//		System.out.println("인원수 : " + score.length);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

//		int max = score[0]; //최대값
//		int min = score[0]; //최소값
//		
//		
//		for (int i = 0; i < score.length; i++) {
//			if (max<score[i]) {
//				max = score[i];
//			} else {min = score[i];
//			
//		}
//			
//
//	}
//		System.out.println(min);
//		System.out.println(max);
//}
	}
}
