package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;


public class IfExam2_2 {

	public static void main(String[] args) {
		


		Scanner scanner4 = new Scanner(System.in);
		
		
		System.out.println("이름 입력");
		String name = scanner4.next();
		
		System.out.println("국어 점수 입력");
		int kor = scanner4.nextInt();

		System.out.println("영어 점수 입력");
		int eng = scanner4.nextInt();
		
		System.out.println("수학 점수 입력");
		int mat = scanner4.nextInt();
		
		int sum = kor + eng + mat;
		
		double avg = (double)sum/3.0 ;
		
		String result = "";
		
		
		if (avg>=80) {result = "합격";
			
		}else {result = "불합격";
			
		}
		
		DecimalFormat f = new DecimalFormat("#,##0.0");			
		
		System.out.printf("이름\t 국어\t 영어\t 수학\t 합계\t 평균\t 판정\n");
		System.out.println("--------------------------------------------------------");
		
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %s\t %s\n", name, kor,eng,mat,sum,f.format(avg),result);
		
		
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s\n", name, kor,eng,mat,sum,avg,resultString);
		System.out.println("--------------------------------------------------------");

		
		
//int nnnn = 456789;
//double nnnnn = 4567.89;
//DecimalFormat f = new DecimalFormat("#,##0.00");			
//		System.out.println(f.format(avg));
	}
}
