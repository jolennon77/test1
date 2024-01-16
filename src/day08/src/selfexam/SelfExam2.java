package selfexam;

import java.util.Scanner;

public class SelfExam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = 0;
		System.out.println("x >>");
		x = scanner.nextInt();

		if ((x > 10) && (x < 20)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
