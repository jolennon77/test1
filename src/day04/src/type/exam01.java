package type;

import java.util.Scanner;


public class exam01 {

	public static void main(String[] args) {
		
		
//Q1------------------------------------------------------------------------------------------------------------		
		System.out.println("\n"+"Q1-------------------------"+"\n");
		Scanner scan1 = new Scanner(System.in);
			
		int score = 0;
		
		System.out.print("점수 입력 >> ");
		score = scan1.nextInt();
		

	System.out.println((score>=70) ? "당신의 점수는 "+score+"점 입니다."+"\n"+"이번시험에서 통과 하였습니다." :
									 "당신의 점수는 "+score+"점 입니다."+"\n"+"이번시험에서 재수강하셔야 합니다."
						);

	
//Q2------------------------------------------------------------------------------------------------------------	
	System.out.println("\n"+"Q2-------------------------"+"\n");
		
		Scanner scan2 = new Scanner(System.in);
	
		int numX = 0;
		int numY = 0;
		
		System.out.print("첫 번째 숫자 입력 >> ");
		numX = scan2.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		numY = scan2.nextInt();
		
		System.out.printf("첫 번째 숫자는 : %d\n", numX);
		System.out.printf("두 번째 숫자는 : %d\n", numY);

		
		
//Q3------------------------------------------------------------------------------------------------------------		
	System.out.println("\n"+"Q3-------------------------"+"\n");
		
		Scanner scan3 = new Scanner(System.in);
		
		int numX2 = 0;
		int numY2 = 0;
		
		System.out.print("첫 번째 숫자 입력 >> ");
		numX2 = scan3.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		numY2 = scan3.nextInt();
		
		System.out.printf("첫 번째 숫자는 : %d\n", numX2);
		System.out.printf("두 번째 숫자는 : %d\n", numY2);
		
		System.out.println((numX2 == numY2) ? "두 수는 같습니다" : 
							((numX2 > numY2) ? "두 수 중 큰 값은 "+numX2+"입니다." : 
								"두 수 중 큰 값은 "+numY2+"입니다."));

		
	
//Q4------------------------------------------------------------------------------------------------------------
	System.out.println("\n"+"Q4-------------------------"+"\n"); 
	
		Scanner scan4 = new Scanner(System.in);
		
		int triangleX = 0; //삼각형 밑변
		int triangleY = 0; //삼각형 높이
		
		System.out.print("삼각형 밑변 길이 >> ");
		triangleX = scan4.nextInt();
		System.out.print("삼각형 높이 길이 >> ");
		triangleY = scan4.nextInt();
		
		int triangleArea = triangleX*triangleY/2;
		
		System.out.printf("삼각형의 밑변 : %d\n", triangleX);
		System.out.printf("삼각형의 높이 : %d\n", triangleY);
		System.out.printf("삼각형의 넓이 : %d\n", triangleArea);
		System.out.printf("삼각형의 넓이 : %d\n", (triangleX*triangleY/2));
		

		
//Q5------------------------------------------------------------------------------------------------------------
	System.out.println("\n"+"Q5-------------------------"+"\n");
	
		Scanner scan5 = new Scanner(System.in);
		
		String name = "";			// 이름
		String PhoneNumber = ""; 	// 전화번호
		String address = ""; 		// 주소
		
		
		System.out.print("이름을 입력 하세요 >> ");
		name = scan5.next();
		System.out.print("전화번호를 입력하세요 >> ");
		PhoneNumber = scan5.next();
		System.out.print("주소를 입력 하세요 >> ");
		address = scan5.next();
		System.out.println();
		

		System.out.printf("이름 : %s\n", name );
		System.out.printf("전화번호 : %s\n", PhoneNumber);
		System.out.printf("주소 : %s\n", address);
		

	
	
	
		
//Q6------------------------------------------------------------------------------------------------------------	
//	System.out.println("\n"+"Q6-------------------------"+"\n");
//
//	Scanner scan6 = new Scanner(System.in);
//	
//	int apple = 0;	// 사과
//	int pear = 0; 	// 배
//	
//	
//	System.out.print("사과의 주문 수량을 입력하세요 >> ");
//	apple = scan6.nextInt();
//	System.out.print("배의 주문 수량을 입력하세요 >> ");
//	pear = scan6.nextInt();
//	
//	사과1 배1 주문 내용이 맞습니까 
//	y - > 주문 내용 사과 1 배 1 출력
//	
//	no 재입력
//	
//	주문내용이 맞음?
//	예
//	
		
	}
}
