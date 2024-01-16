package selfexam;

import java.util.Scanner;

public class SelfExam9 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("구구단 단수>>");
	int dan = scanner.nextInt();
	
	int i = 1;
	
	while (i<=9) {
		System.out.println(dan + "*" + i +"=" + (dan * i) );
		i++;
		
		
	}
	
	
	}
}
