package array3;

import java.util.Iterator;
import java.util.zip.CheckedOutputStream;

public class arrayExam02 {

	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;

		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}

		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });

		System.out.println("총합 : " + sum2);
		System.out.println();

		int[] scores1 = new int[] { 83, 90, 87 };
		int sum3 = add(scores);
		System.out.println("총합 : " + sum3);
	}

	public static int add(int[] scores) {

		int sum = 0;

		for (int i = 0; i < 3; i++) {

			sum += scores[i];
		}

		return sum;
	}
}