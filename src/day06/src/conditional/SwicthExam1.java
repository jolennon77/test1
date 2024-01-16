package conditional;

import java.util.Scanner;

public class SwicthExam1 {

	public static void main(String[] args) {

	
		

		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		String season = "";
		
		System.out.println("몇월인가요");
		month = scanner.nextInt();
		
		
		switch (month) {
		case 12, 1, 2:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
		break;
		case 6, 7, 8:
			season = "여름";
		break;
		case 9, 10, 11:
			season = "가을";
		break;
		default: season = "오류";
			break;
		}
		
		
		System.out.println(season);
		
		
		
	}
}
