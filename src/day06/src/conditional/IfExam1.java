package conditional;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("성적입력");
		int score = scanner.nextInt();
		
		
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
