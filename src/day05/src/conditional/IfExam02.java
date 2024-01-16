package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;


public class IfExam02 {

	public static void main(String[] args) {
		
		
		int cost = 0;
		cost = 300000;
		
		if (cost>=300000) {System.out.println("상품권 증정");
			
		}
		
		System.out.println();
		//-----------------------------------------------------
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("숫자입력");
		int var1 = scanner.nextInt();
		
		if (var1%2==1) {System.out.println(var1*2);
			
		}
		
		
		
		System.out.println();
		
		
		
		Scanner scanner1 = new Scanner(System.in);
		
		
		System.out.println("숫자입력");
		int var2 = scanner1.nextInt();
		
		if (var2%2==1) {System.out.println(var2*3);
			
		} else {System.out.println(var2*2);
			
		}
		
		
		
		System.out.println();
		
		//-------------------------------------
		
		Scanner scanner2 = new Scanner(System.in);
		
		
		System.out.println("평가 점수 입력");
		int var_1 = scanner2.nextInt();
		
		if (var_1>5) {System.out.println("연수 신청 가능");
			
		} else {System.out.println("연수 신청 불가능");

		}
		
		System.out.println();
//		
//	//	------------------------
//		
		
		Scanner scanner3 = new Scanner(System.in);
		
	
		
		System.out.println("숫자 입력");
		int num = scanner3.nextInt();
		
		int result = num%2;
		
		if (result == 0) {if (num == 0) {System.out.println("당신이 입력한 값 "+num+"은, 짝수도 홀수도 아닙니다.");
			
		} else {System.out.println("당신이 입력한 값인 "+num+"은, 짝수 입니다.");}
			
			
		} else {System.out.println("당신이 입력한 값인 "+num+"은, 홀수 입니다.");

		}
		System.out.println();
		//--------------------
		
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num4 = scanner4.nextInt();
		
		
		if (num4 != 3) {System.out.println("입력한 숫자는 3이 아닙니다 입력한 숫자는 " + num4+"입니다.");} 
		
		//--------------------
		
		
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner4.next();
		System.out.println("국어 점수 입력");
		int kor = scanner4.nextInt();

		System.out.println("영어 점수 입력");
		int eng = scanner4.nextInt();
		
		System.out.println("수학 점수 입력");
		int mat = scanner4.nextInt();
		
		int sum = kor + eng + mat, avg = sum/3 ;
		String resultString = "";
		
		
		if (avg>=80) {resultString = "합격";
			
		}else {resultString = "불합격";
			
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t판정\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%S\n", name, kor,eng,mat,sum,avg,resultString);
		
		
int nnnn = 456789;
double nnnnn = 4567.89;
DecimalFormat f = new DecimalFormat("#,##0.00원");			
		System.out.println(f.format(nnnn));
	}
}
