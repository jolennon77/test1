package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정
		int PurchaseAmount = 0; // 구매금액 변수
		String result = ""; // 결과 변수

		System.out.println("구매금액을 입력하세요.");
		PurchaseAmount = sc.nextInt();

		// 조건문
		if (PurchaseAmount > 30000) {
			result = "상품권 5천원 증정";
		} else {
			result = "구매 금액이 부족합니다.";

		}
		// 결과 출력
		System.out.println(result);

	}
}