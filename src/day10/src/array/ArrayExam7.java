package array;

import java.util.Scanner;

public class ArrayExam7 {
	public static void main(String[] args) {

		
		//400으로 나누면 0 또는
		//100나눈 값이 0 
		
		
		System.out.println("연도를 입력하시오.");
		Scanner scaner = new Scanner(System.in);
		int year = scaner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년 : "+ year );
		} else {
			System.out.println("평년 : "+ year );
		}
	}

}