package conditional;

import java.util.Scanner;

public class IfExam0 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("성적입력");
		int score = scanner.nextInt();
//		
//		if (score>=80) {System.out.println("합");
//			
//		}	else {
//			System.out.println("불합");
//		}
//		
//		System.out.println("즐거운 시");
//	
//		
		
		
//		if (score>=90) {System.out.println("우수");
//			
//		} else {if (score>=80) {System.out.println("보통");
//			
//		}	else { System.out.println("노력요함");}
//
//		}
//		
//		System.out.println("즐거우닛간");
//
		String result = "";
		
		if (score>=90) { System.out.println("A");
			
		} else if (score>=80) {result = "B";
			
		} else if (score>=70) {result = "C";
			
		} else if (score>=70) {result = "D";
			
		} else {result = "F";
			
		}
		
		System.out.println(result);
		System.out.println("즐거운시간");
	}

}
