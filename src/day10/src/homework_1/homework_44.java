package homework_1;

import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class homework_44 {

	static Scanner scanner = new Scanner(System.in);

	public static void pint(int printAmount, int printingMethod) {
		int paperNumber = 100; // 초기용지

		//
		if (printingMethod == 2) { // 양면인쇄인경우
			printAmount = (printAmount % 2 == 0) ? printAmount / 2 : printAmount / 2 + 1;
			// 프린트매수는 = 짝수일때는 나누기2 /홀수일때는 나누기2 + 1 int는 정수로 나오기에
			// 단면페이지를 추가해야함 ex 99/2 => 49.5 => 50장
		}

		if (paperNumber == 0) { // 초기용기 없을시 출력
			System.out.println("용지 없음");
		} else if (paperNumber < printAmount) { // 초기용기 < 인쇄량
			System.out.println("용지 부족 : " + (printAmount - paperNumber)); // 용지 부족 및 필요 용지량 안내
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0; // 기본용지를 0으로 설정
		} else {
			paperNumber -= printAmount;// == paperNumber = paperNumber - printAmount;
			System.out.println(printAmount + "장출력");
			System.out.println("남은 용지 매수 : " + paperNumber);
		}

	}	//End of print method

	public static void main(String[] args) {

		System.out.println("1.단면 or 2.양면");
		int printingMethod = scanner.nextInt();

		System.out.println("출력할 페이지 수 입력");
		int printAmount = scanner.nextInt();

		pint(printAmount, printingMethod);
	}//end of main
	
}