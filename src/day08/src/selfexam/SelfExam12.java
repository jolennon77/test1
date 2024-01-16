package selfexam;

import java.util.Scanner;

public class SelfExam12 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수입력");
		
		int a = scanner.nextInt();
		int b = 1;
		
		while (b<=a) {
			System.out.println("("+b+","+(a-b)+")");
			b++;
			
		}
	
	}
}
