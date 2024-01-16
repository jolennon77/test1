package array3;
import java.util.Scanner;


public class arrayExam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		//수입력 받기
		System.out.println("수입력");
		int input = sc.nextInt();

		
		
		int k = 1;
		int[][] count = new int[input][input];

		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i].length; j++) {
				count[i][j] = k;
				System.out.printf("%5d", count[i][j]);
				k += 3;
			} // end of in for
			System.out.println();
		} // end of out for

		System.out.println("------------------------------------");

		int kk = 1;
		int[][] countt = new int[3][3];

		for (int i = 0; i < countt.length; i++) {
			for (int j = 0; j < countt[i].length; j++) {
				countt[i][j] = kk;
				System.out.printf("%5d", countt[i][j]);
				kk += 3;
			} // end of in for
			System.out.println();
		} // end of out for

	}// end of main

}