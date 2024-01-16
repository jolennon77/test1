package arrayRework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.xml.stream.events.EndDocument;

public class arrayRework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = { 79, 88, 33, 100, 50, 90 };
		int choiceNumber = 0;

		System.out.println("수 입력");
		choiceNumber = sc.nextInt();

		int count = 0;
		for (int i = 0; i < number.length; i++) {
			count++;
			if (choiceNumber == number[i]) {
				System.out.println("선택한 번호는 : " + choiceNumber + "\n배열의 요소 위치 : " + i);

//			count++;			// if문에 카운트 증감식이 있으면 매칭 값이 없으면 다음 이프문에서 카운트 값이 초기화(=0)
								// 여기에서 카운트는 이프문 지역변수로 사용 따라서 이프문 밖 포문의 변수로 설정해줘야함
				break;
			} // end of if1

			if (count == number.length) {
				System.out.println("찾는 값이 없습니다.");

			}

		} // end of for

	}// end of main
}
