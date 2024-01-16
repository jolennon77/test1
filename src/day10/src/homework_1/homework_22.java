package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt(); 				// 입력값변수 설정

		// 조건문 & 결과 출력
		if (num % 2 == 1) {
			System.out.println(num * 2);
		}

	}
}