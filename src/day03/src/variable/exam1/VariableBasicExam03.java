package variable.exam1;

import javax.naming.spi.DirStateFactory.Result;

public class VariableBasicExam03 {

	public static void main(String[] args) {
		
	System.out.println("\n"+"Q1--------------------------"+"\n");
		
		int pencil = 357;
		int student = 13;
		
			System.out.print("1인당 연필 갯수 : ");	System.out.println(pencil/student);
			System.out.print("연필 나머지 : ");		System.out.println(pencil%student);
		
	System.out.println("\n"+"Q2--------------------------"+"\n");
		
		int number = 756;
				System.out.println(number-(number%10));
	
		
	System.out.println("\n"+"Q3--------------------------"+"\n");
	
		int member = 5;
		String result = "";
			
			result = (number%2 == 0) ?"A Team" : "B team";
			System.out.println(result);
		
	
	System.out.println("\n"+"Q4--------------------------"+"\n");
	
		int testScore = 55;
		int minimumScore = 80;
			
		System.out.println((testScore>=minimumScore) ? "합격" : "불합격");
		
		
		if (testScore>=minimumScore) {System.out.println("합격");
		} else {System.out.println("불합격");
		}
			
	System.out.println("\n"+"Q5--------------------------"+"\n");
	
		int kor = 80;
		int eng = 65;
		int mat = 70;
//		int deadLine =
	
	
//	System.out.println("\n"+"Q6--------------------------"+"\n");
		
	
	}
	
	

		
	
}
