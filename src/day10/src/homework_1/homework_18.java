package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정
		System.out.println("첫번째 수를 입력하세요");
		int num1 = sc.nextInt(); // 첫번째 숫자 변수
		System.out.println("두번째 수를 입력하세요");
		int num2 = sc.nextInt(); // 두번째 숫자 변수
		int maxValue = 0; // 두수를 비교해 큰 값을 담을 변수 

		
		//출력과 조건문 
		
		System.out.println("첫 번째 숫자: " + num1);	//1. 두수의 값을 우선 출력
		System.out.println("두 번째 숫자: " + num2);	

		if (num1 == num2) {								//2. 조건문으로 마지막 문장 출력 (경우의 수 3개)						
		    System.out.println("첫 번째 숫자와 두 번째 숫자는 같습니다.");	//두 수가 같을 경우에 출력
		} else if (num1 > num2) {
		    maxValue = num1;
		    System.out.println("두 수 중 큰 값은 " + maxValue + "입니다.");	//num1이 클 경우 출력
		} else {
		    maxValue = num2;
		    System.out.println("두 수 중 큰 값은 " + maxValue + "입니다."); //num2이 클 경우 출력
		}

	}

}