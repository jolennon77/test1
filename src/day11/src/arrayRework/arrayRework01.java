package arrayRework;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRework01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score[] = new int[5];
		String name[] = new String[5];
		int sum = 0;

		for (int i = 0; i < name.length; i++) {
			System.out.println("학생이름을 입력하세요");
			name[i] = sc.next();
			System.out.println("점수를 입력 하세요");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum / score.length;

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
		System.out.println(sum);
		System.out.println(avg);

	}
}
