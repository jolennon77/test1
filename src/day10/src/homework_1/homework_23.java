package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 입력값 변수 설정
		System.out.println("이름을 입력하세요.");
		String name = sc.next(); // 이름변수

		System.out.println("평가 점수를 입력하세요."); // 평가점수변수
		int score = sc.nextInt();

		// 조건문 & 결과 출력
		if (score >= 5) {
			System.out.println("연수 참여가 가능합니다.");
		} else {
			System.out.println("연수 참여가 불가능합니다.");
		}

	}
}