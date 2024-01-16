package array3;

import java.util.Scanner;


public class arrayExam11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] fruit = new String[] { "사과", "배", "딸기", "바나나", "오렌지" };
		String[] fruitEng = new String[] { "apple", "pear", "strawberry", "banana", "orange" };

/*		초기배열 확인
		System.out.println(fruit[0]);
		for (int i = 0; i < fruit.length; i++) {
		}
		System.out.println("초기 배열");
		System.out.println(Arrays.toString(fruit));
		System.out.println(Arrays.toString(fruitEng));

		 배열 랜덤 섞기
		for (int i = 0; i < fruit.length; i++) {
			String korTemp = " "; // temp 변수 공간을 만들어서 한국어, 영어 배열을 동일하게 섞는다.
			String engTemp = " ";
			int k = (int) (Math.random() * fruit.length); // 0번 배열과 바꿀 k난수 생

			korTemp = fruit[0]; // 배열 교환
			engTemp = fruitEng[0];

			fruit[0] = fruit[k];
			fruitEng[0] = fruitEng[k];

			fruit[k] = korTemp;
			fruitEng[k] = engTemp;

		}*/
		
		//두개의 배열 섞는 메소드	위코드를 메소드화
		suffle(fruit, fruitEng);
		
		
//		수정 배열 확인
//		System.out.println("수정 배열");
//		System.out.println(Arrays.toString(fruit));
//		System.out.println(Arrays.toString(fruitEng));

		// 질문
		System.out.println("\"" + fruitEng[0] + "\"의 한국어 과일 이름은?");
		String answer = sc.nextLine();

		if (answer.equals(fruit[0])) {
			System.out.println("정답입니다.");

		} else {
			System.out.println("오답입니다.\n정답은 " + fruit[0] + "입니다.");
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

		}	//end of for
	} //end of method

} //end of class