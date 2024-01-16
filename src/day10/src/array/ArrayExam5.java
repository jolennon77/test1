package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam5 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("숫자 입력");
		int num1 = scanner.nextInt(); // 수 입력 받기

		int[] array1 = new int[num1]; 
		int[] array2 = new int[num1]; 				
		for (int i = 0; i < array1.length; i++) { 
			
			
			array1[i] = i + 1; 	
			array2[i] = i + 3;
			
			
			
		}
			
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	} // end of main

	
}