package homework_1;

import java.util.Scanner;

public class homework_06 {

	public static void main(String[] args) {

		
		// 두수 의 변수 설정
		int firstNumber = 5;
		int secondNumber = 7;
		
		//변경전 출력
		System.out.println("변경전 fistNum = " +firstNumber);
		System.out.println("변경전 secondNum = " +secondNumber);
		
		
		//변경을 위한 변수 설정 및 변수 변경
		int temp = 0;					//두 수의 값을 교환 하기 위한 임시 변수 생성
		temp = secondNumber;			// tmep = 7 / first = 5 / second = 7
		secondNumber = firstNumber;		// tmep = 7 / first = 5 / second = 5
		firstNumber = temp;				// tmep = 7 / first = 7 / second = 5
		
		
		//결과 출력
		System.out.println();
		System.out.println("변경전 fistNum = " +firstNumber);
		System.out.println("변경전 secondNum = " +secondNumber);
		
		
	}

}