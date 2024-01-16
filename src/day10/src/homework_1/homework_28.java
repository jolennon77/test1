package homework_1;

import java.util.Scanner;

public class homework_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("번역 입력");
		int point = sc.nextInt();
		String grade = "";

		if (point < 10) {
			grade = "일반회원";

		} else if (point < 20) {
			grade = "GOLD";

		} else {
			grade = "VIP";

		}

		System.out.println(grade);
	}
}