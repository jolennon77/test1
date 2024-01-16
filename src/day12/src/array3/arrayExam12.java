package array3;

import java.util.Scanner;

public class arrayExam12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] day = new String[] { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		String[] dayEng = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		// 배열 랜덤 섞기
		suffle(day, dayEng);

		// 질문
		System.out.println("\"" + day[0] + "\"를 영어로는?");
		String answer = sc.nextLine();

		// 결과 출력
		if (answer.equalsIgnoreCase((dayEng)[0])) {
			System.out.println("정답입니다.");

		} else {
			System.out.println("오답입니다.\n정답은 \"" + dayEng[0] + "\"입니다.");
		} // end of if

	}// end of main

	public static void suffle(String[] arrayKor, String[] arrayEng) {
		for (int i = 0; i < arrayKor.length; i++) {
			String korTemp = " "; // temp 변수 공간을 만들어서 한국어, 영어 배열을 동일하게 섞는다.
			String engTemp = " ";
			int k = (int) (Math.random() * arrayKor.length); // 0번 배열과 바꿀 k난수 생

			korTemp = arrayKor[0]; // 배열 교환
			engTemp = arrayEng[0];

			arrayKor[0] = arrayKor[k];
			arrayEng[0] = arrayEng[k];

			arrayKor[k] = korTemp;
			arrayEng[k] = engTemp;

		}
	}

}