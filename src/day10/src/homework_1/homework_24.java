package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력값 변수 설정
		System.out.println("숫자 입력");
		int num = sc.nextInt();

		String result = "";

		// 조건문
		if (num % 2 == 0) {
			result = "당신이 입력한 값인 " + num + "은, 짝수 입니다.";
		} else {
			result = "당신이 입력한 값인 " + num + "은, 홀수 입니다.";
		}

		// 출력
		System.out.println(result);

	}
}