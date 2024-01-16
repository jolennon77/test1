package array;

import java.util.Scanner;

public class ArrayExam6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] names = new String[3];
		int[] scores = new int[3];
		int sum = 0;
		int avg = 0;
		
//입력 받기

		for (int i = 0; i < scores.length; i++) {
			System.out.print("이름입력>>");
			names[i] = scanner.nextLine();

			System.out.print("성적입력>>");
			scores[i] = Integer.parseInt(scanner.nextLine());
		}
		
	
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum/scores.length;
			
		
//출력하기		

		for (int i = 0; i < scores.length; i++) {

			System.out.println("----------------");
			System.out.println("학생이름 : " + names[i]);
			System.out.println("성    적 : " + scores[i]);
		}
		
		System.out.println("평    균 : " +avg);
	} // end of main

}