package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 변수 설정
		int apple = 0; // 사과 개수
		int pear = 0; // 배 개수

		// 반복문
		while (true) {
			System.out.print("사과의 주문 수량을 입력하세요 >> ");
			apple = sc.nextInt();
			System.out.print("배의 주문 수량을 입력하세요 >> ");
			pear = sc.nextInt(); // 1. 처음 주문 수량 입력!

			System.out.printf("\n주문결과\n사과 : %d\n배 : %d\n", apple, pear); // 2. 주문 결과 출력
			System.out.print("\n주문이 맞습니까? (Y/N) >> "); // 3. 주문 확인 입력 요구

			String answer = sc.next(); // 4. 주문 확인을 위한 변수 설정 및 값의 입력받아서

			if (answer.equalsIgnoreCase("n")) { // 5. 입력받은 값이 n 값이면
				continue; // 6. continue 를 사용해 반복문의 처음으로 돌아 수량을 재 입력.
			}
			System.out.println("주문 감사합니다!"); // 7. 입력값이 y 면 주문 감사 메세지 출력 후
			break; // 8. break 로 반복문 종료
		}
	}
}