package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정
		System.out.println("점수를 입력하세요");
		int num1 = sc.nextInt(); // 첫번째 숫자 변수 저장
		int num2 = sc.nextInt(); // 두번째 숫자 변수 저장

		// 결과 출력
		System.out.println("첫 번째 숫자는 : " + num1);
		System.out.println("두 번째 숫자는 : " + num2);

	}

}