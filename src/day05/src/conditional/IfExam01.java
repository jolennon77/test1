package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		String name = scanner.next();

		System.out.println("국어 점수 입력");
		int kor = scanner.nextInt();

		System.out.println("영어 점수 입력");
		int eng = scanner.nextInt();
		
		System.out.println("수학 점수 입력");
		int mat = scanner.nextInt();
		
		int sum = kor + eng + mat, avg = sum/3 ;
		String resultString = "";
		
		
		if (avg>=80) {resultString = "합격";}
			else {resultString = "불합격";}
		System.out.println("-----------------------------------------------------------");
		System.out.printf("이\t국어\t영어\t수학\t합계\t평균\t판정\n");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s\n",name,kor,eng,mat,sum,avg,resultString);
		System.out.println("-----------------------------------------------------------");
		
		
		
//int nnnn = 456789;
//double nnnnn = 4567.89;
//DecimalFormat f = new DecimalFormat("#,##0.00원");			
//		System.out.println(f.format(nnnn));
	
//	------------------------------------------------------------------------------------
		
		
	}
}
