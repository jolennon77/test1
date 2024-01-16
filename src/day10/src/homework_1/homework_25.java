package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력값 변수 설정
		System.out.println("숫자 입력"); // 변수 입력
		int num = sc.nextInt();

		String result = "";

		// 조건문
		if (num % 3 != 0) {
			result = "당신이 입력한 숫자는 '3'이 아닙니다.\n입력한 숫자는 " + num + "입니다.";
		}

		// 출력
		System.out.println(result);
		
	}
}