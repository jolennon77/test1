package arrayRework;

import java.util.Scanner;


public class arrayRework_1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int number[] = { 79, 88, 33, 100, 50, 90 };
		
		System.out.println("수입력");
		
		int answer = scanner.nextInt();
		int position = -1;
		
		for (int i = 0; i < number.length; i++) {
			
			if (answer==number[i]) {
				position = i;
				break;
			} //end of if
		} //end of for
		
		if (position != -1) {
            System.out.println("찾는 값: " + answer);
            System.out.println("배열 위치: " + position);
		} else {
			System.out.println("찾는 값이 없습니다.");
		}

	}
}
