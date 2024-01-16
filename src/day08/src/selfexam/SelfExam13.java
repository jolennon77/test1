package selfexam;

import java.util.Scanner;

public class SelfExam13 {

	public static void main(String[] args) {

	int x = 0;
//	int count = 0;
	
	while (x < 100 ) {
		if (x%10==3||x%10==6||x%10==9) {
			System.out.println(x);
		}
		x++;
	}
	
	}
}
