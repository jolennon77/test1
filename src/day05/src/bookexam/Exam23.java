package bookexam;

import java.util.Scanner;


public class Exam23 {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Q1---------------------------------------------------------------------------------");
		System.out.println();
					
		
			byte b = 5; 
//			b = -b;  ----> -b = b * -1 즉 연산이된것이므로 인트로 형변환됨
			int result = 10 / b;
			System.out.println(result);

		
		System.out.println();
		System.out.println("Q2---------------------------------------------------------------------------------");
		System.out.println();
		
			int x = 10;
			int y = 20;
			int z = (++x) + (y--);
			System.out.println(z);
			
		System.out.println();
		System.out.println("Q3---------------------------------------------------------------------------------");
		System.out.println();
						
			
			// !ture
		
		System.out.println();
		System.out.println("Q4---------------------------------------------------------------------------------");
		System.out.println();		
		
	
			int pencils = 534;
			int students = 30;
			
			int pencilsPerStudent = pencils / students; 
			System.out.println(pencilsPerStudent);
			
			int pencilsLeft = pencils%pencilsPerStudent;
			System.out.println(pencilsLeft);
	
			
		System.out.println();
		System.out.println("Q5---------------------------------------------------------------------------------");
		System.out.println();		
						
			int var1 = 5;
			int var2 = 2;
			double var3 = var1 / var2 ; // 더블 2.5 를 인트로 변환 하면 정수 2가 되어 var 4 값이 4로 출력
			int var4 = (int) (var3 * var2);
			
			System.out.println(var4);
			
			
			
			//6
			
			
			int value = 356;
			
			System.out.println(value/100*100);
			System.out.println(value-(value%100));
			
			
			//7
			
			float var11 = 10f;
			float var22 = (float)var11 / 100; // 실수 / 정수 - > 실수
			
			
			
			
			if( var22 == 0.1) {System.out.println("10%");} // 실수라 정확한 값이 아님
			else {
				System.out.println("not 10%");
			};
			
			
			
			//8
			
			
			int lengthTop = 5;
			int lengthBottm = 10;
			int height = 7;
			double erea = ((double)(lengthTop +lengthBottm)  * height /2);
			
			System.out.println(erea);
		
			
		
			
		//10
			
			
		int var_1 = 10;
		int var_2 = 3;
		int var_3 = 14;
		
//		String intValue2 = Integer.toString(var_2); // 3을 인트로 변경
//		String intValue3 = Integer.toString(var_3); // 14를 인트로 변경
//		String piString = intValue2+"."+intValue3; // 3.14를스트링으로형성
//				
//		double piDouble = Double.parseDouble(piString); // 스트링 3.14를 더블로 변경
		double dodododo = Double.parseDouble(var_2+"."+var_3);
		System.out.println(dodododo);
		
		
		
//		double var_4 = (var_1 * var_1) * piDouble;  // 원넓이 계산
		
		double var_5 =  var_1 * var_1 * dodododo;
		
		
		
//		System.out.println("원의 넓이 : " + var_4);
		System.out.println(var_5);
		
		System.out.println();
		System.out.println("-----------------------------------");
//		  --------------------------------------------------------
		
		
		
				
			Scanner scanner11 = new Scanner(System.in);
			
			System.out.println("아이디:");
			String nameString = scanner11.nextLine();
			
			System.out.println("패스워드:");
			String strPasswordString = scanner11.nextLine();
			
			int password = Integer.parseInt(strPasswordString);
			
			if (nameString.equals("java")) {
				
				if (strPasswordString.equals("12345")) {
					System.out.println("secess");
					} 
				else {
					System.out.println("faile incorrect password");
					}
				} 
			else 
			{
				System.out.println("faile incorrect ID");
			}
				
			int xxx = 10;
			int yyy = 5;
			System.out.println((xxx>7) && (yyy<=5)); 
								//true     true  -> true
			System.out.println((xxx%3 == 2) && (yyy%2 != 1)); 
								//false  fales -> false
			
			//
			int valuee = 0;
			
			
			System.out.println(valuee+=10);
			System.out.println(valuee-=10);
			System.out.println(valuee*=10);
			System.out.println(valuee/=10);
			
			///가
			
			int q14Score = 85;
			
			String q14Result = (!(q14Score>90)) ? "가":"나"			;
			System.out.println(q14Result);
				
	}
	

	

}