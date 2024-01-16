package variable.exam1;

public class VariableBasicExam02 {

	public static void main(String[] args) {
		

	System.out.println("\n"+"Q1---------------------------------"+"\n");
		
		int pencil = 357 ;
		int student = 13;
	
	
		int pencilPerPerson = pencil /student;
		int remain = pencil % student;
	
	
		System.out.print("1인당 연필 개수 : ");	System.out.println(pencilPerPerson);
		System.out.print("남은 연필 개수 : ");	System.out.println(remain);
		
	
	
	
	System.out.println("\n"+"Q2---------------------------------"+"\n");
	
		
		int num1 = 756;
		int num2 = num1/10; 
		int num3 = num1/10/10; 
		
		int num_100 = num3;
		int num_10 = num2%10;
		int num_1 = num1%10;
		
		
		
		
		System.out.println((num2)*10);	
		
		
		
		System.out.println("-------------------");
		
		System.out.println(num_100);
		System.out.println(num_10);
		System.out.println(num_1);
		
		System.out.println(num_100 + num_10 + num_1);
	
		int numX = 5;

		if (numX%2 == 1) {System.out.println("A Team");
			
		} else {System.out.println("B Team");

		}

		if (numX%2 != 1) {System.out.println("A Team");
		
		} else {System.out.println("B Team");
		
		}
		
		
		int numX2 = 5;
		String result = "";
//						삼항연산	(조건) 		  	 ? true결과 : false결과  
		System.out.println(result = (numX2 % 2 == 1) ? "A Team" : "B Team" ); 
		
	
		System.out.println("Q3-------------");
		
		
		int testResult = 55;
		
		result = (testResult >= 80) ? "합격" : "불합격";  
		System.out.println(result);

		
		
		
		if (testResult >= 80) {System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		

		System.out.println("\n"+"Q4-------------"+"\n");
				
		
		int kor = 80;
		int eng = 65;
		int mat = 70;
		int cutline = 60;
		
		String result1 = "";
		
		result1 = (kor>=cutline && eng>=cutline && mat>=cutline) ? "합격" : "불합격" ;
		System.out.println(result1);
		
		
		if (kor>=cutline && eng>=cutline && mat>=cutline) {System.out.println("합격");
			
		} else {System.out.println("불합격");

		}
		
		
		System.out.println("\n"+"Q5-------------"+"\n");
		
		
		int java = 55;
		int soft = 30;
		int cutline2 = 70;

		String result2 = "";
		
		result2 = (java>=cutline2 || soft>=cutline) ? "통과" : "재수강" ;
		System.out.println(result2);
	
		
		
		if (java>=cutline2 || soft>=cutline) {System.out.println("통과");
		
		} else {System.out.println("재수강");

		}

		System.out.println("\n"+"-------------"+"\n");		
		
//		order>=10 // vip
//		10>order>=5 // gold
//		5>order>=0 // nomal
//		
		
		
		int order0 = 10;
		result2 = (order0>=5) ? ((order0<10) ? "gold" : "vip") : "nomal" ;
		System.out.println(result2);
		
		
		
		
		int order = 5;
		if (order>=5) {
			if (order<10) {System.out.println("gold");
					} else {System.out.println("vip");
				}
			} else {System.out.println("nomal");
		}
		
		
		
		System.out.println("\n"+"-------------"+"\n");
		
		
		int x = 1;
		int y = 1;
		int a = 1;
		int b = 1;
		
		int result_1 = ++x + 10; // 12 
		int result_2 = y++ + 10; // 11
		int result_3 = a-- + 10; // 11
		int result_4 = --b + 10; // 10
		
		System.out.println(result_1);
		System.out.println(result_2);
		System.out.println(result_3);
		System.out.println(result_4);
		
		
//		System.out.println(a);
//		System.out.println(a+=1);
//		System.out.println(a++);
//		System.out.println(++a);

	
	}
	
	

		
	
}
