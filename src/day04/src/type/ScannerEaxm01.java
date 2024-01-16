package type;

import java.util.Scanner;

public class ScannerEaxm01 {

	
	
	public static void main(String[] args) {
//		1. 스캐너 클래스 사용 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
//		2. 변수 선언
		String name = "";	//	이름
		int kor = 0; 		// 	국어점수
		int eng = 0; 		// 	국어점수
		int mat = 0; 		// 	국어점수
		int sum = 0;		// 3과목 합계 
		double avg = 0;		// 과목 평균
		
//		3. 안내문구
		System.out.print("이름을 입력 하세용 >> ");
		name = scan.next();
		
		System.out.print("국어점수를 입력 하세용 >> ");
		kor = scan.nextInt();
		
		System.out.print("영어점수를 입력 하세용 >> ");
		eng = scan.nextInt();
		
		System.out.print("수학점수를 입력 하세용 >> ");
		mat = scan.nextInt();
		
		System.out.println("");
		
		sum = kor+eng+mat;
		avg = sum/3.0;

//		
//		int kor=0, eng=0, mat=0, sum=0;
//		double avg = 0.0;
//		String name = "";	//	이름
//		
//		System.out.println("이름, 국어, 영어, 수학 점수 입력>>");
//		
//		name = scan.next(); // 탭 공란 엔터로 구분
//		kor = Integer.parseInt(scan.next()); // 문자열형의 숫자를 정수형으로 변경
//		eng = Integer.parseInt(scan.next());
//		mat = Integer.parseInt(scan.next());
//		
//		sum = kor + eng + mat;
//		avg = (double)sum/3 ; 
//		
//		System.out.println("** "+name+"의 성적 **");
//		System.out.println("이름 : "+ name);
//		System.out.println("국어 : "+ kor);
//		System.out.println("영어 : "+ eng);
//		System.out.println("수학 : "+ mat);
//		System.out.println("합계 : "+ sum);
//		System.out.printf("평균 : %.2f \n", avg);
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, mat, sum, avg);
//		평균 90이상 A
//		평균 80이상 B
//		평균 70이상 C
//		평균 60이상 D
//		나머지 F
		
		System.out.println(
				((avg >= 90) ? "당신의 평균은 " + avg + "점 이고 등급은 A입니다." : 		
					((avg >= 80) ? "당신의 평균은 " + avg + "점 이고 등급은 B입니다." : 
						((avg >= 70) ? "당신의 평균은 " + avg + "점 이고 등급은 C입니다." : 
							((avg >= 60) ? "당신의 평균은 " + avg + "점 이고 등급은 D입니다." : 
								"당신의 평균은 " + avg + "이고 등급은 F입니다." )))));
	
	
	
	
		if (avg >= 90) {System.out.printf("당신의 평균은 %.2f점이며 등급은 A입니다.\n", avg);
					} else { if (avg >= 80) {System.out.printf("당신의 평균은 %.2f 점이며 등급은 B입니다.\n", avg);
					} else { if (avg >= 70) {System.out.printf("당신의 평균은 %.2f 점이며 등급은 C입니다.\n", avg);
					} else { if (avg >= 60) {System.out.printf("당신의 평균은 %.2f 점이며 등급은 D입니다.\n", avg);
					} else {System.out.printf("당신의 평균은 %.2f 점이며 등급은 F입니다.\n", avg);}}}}
				
	
	

		System.out.println("\n"+"Q2------------------------------------"+"\n");
		
		
		Scanner scan2 = new Scanner(System.in);
		
		int num = 0;	//	숫자
		
		
		
		
		System.out.print("숫자 입력! >> ");
		num = scan2.nextInt();
				
		System.out.println((num % 2) == 1 ? "당신이 입력한 숫자는 "+num+"이고, 홀수 입니다." :
					"당신이 입력한 숫자는 "+num+"이고, 짝수 입니다.");
	}
}
