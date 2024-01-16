package selfexam;

import java.util.Iterator;
import java.util.Scanner;

public class SelfExam6 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("x>>");
	int x =scanner.nextInt();
	
	System.out.println("y>>");
	int y =scanner.nextInt();
	
	int gob = 1;
	
	if (x<y) {
		for (int i = x; i <= y; i++) { // 1 2
			gob = gob *i;
			
		}
		
	} else {for (int i = y; i <= x; i++) { // 1 2
		gob = gob *i;}

	}
	System.out.println(gob);
	}
}
