package selfexam;

import java.util.Scanner;

public class SelfExam11 {

	public static void main(String[] args) {

	int x = 1;
	int count = 0;
	
	while (x <= 100 ) {
		if (x%4==0||x%7==0) {
			System.out.println(x);
			
		}
		x++;
	}
		System.out.println(x);	
	
	}
}
