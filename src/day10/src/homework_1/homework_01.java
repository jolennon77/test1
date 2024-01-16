package homework_1;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class homework_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		//변수 설정
		String name = "";					//이름 변수
		int kor = 0;						//국어 점수
		int eng = 0;						//영어 점수
		int math = 0;						//수학 점수 
		int sum = kor + eng + math;			//합계 
		int avg = sum;						//평균 점수

		
		
		//입력 받기
		System.out.print("이름을 입력하세요 >>");				
		name = scanner.nextLine();

		System.out.print("국어 점수를 입력하세요 >>");			
		kor = scanner.nextInt();

		System.out.print("영어 점수를 입력하세요 >>");
		eng = scanner.nextInt();

		System.out.print("수학 점수를 입력하세요 >>");
		math = scanner.nextInt();

		
		
		//결과 출력
		System.out.println("\n** " + name + "의 중간고사 성적 **");
		System.out.println("=====================================================");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n", name, kor, eng, math, sum, avg);
		System.out.println("=====================================================");

	}

}
