package homework_1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 변수 설정
		String recommend = ""; // 추천장소 변수
		System.out.println("당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요. (산/바다) >> "); // 입력
		String result = sc.next();

		// 추천장소 조건문
		if (result.equals("산")) {
			recommend = "한라산";

		} else {
			recommend = "동해";
		}

		// 출력 조건문
		if (result.equals("산") || result.equals("바다")) {
			System.out.printf("당신이 선택한 여행 희망지는 \'%s\'입니다.\n당신에게 추천하는 곳은 \'%s\'입니다.", result, recommend);

		} else {
			System.out.println("올바른 값을 입력 하세요"); // 산과 바다가 아닌 값일시 출력

		}
	}
}