package array2;

import java.util.Scanner;

public class Array2Exam5error {

	public static void main(String[] args) {

//		-변수 설정 방법1-
//		int score[] = new int[5];
//		score[0] = 100;
//		score[1] = 99;
//		...
//		-변수 설정 방법2-

//		int[ ]score = new int[] { 100, 88, 100, 90, 50 };

//		-변수 설정 방법3-		
		int score[] = { 100, 88, 100, 90, 50 };

		int selectNum = 0;
		int count = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자 입력");
		selectNum = scanner.nextInt(); // 수입력

		for (int i = 0; i < score.length; i++) {

			if (selectNum == score[i]) { // 입력된 수와 배열 인덱스 값이 같으으

				System.out.println(	"찾는값 : " + selectNum + "\n배열의 요소 위치 : " + (i + 1));
				break;
			} else {
				System.out.println("찾는 값이 없습니다"); //이렇게 코딩 할 경우 <- else 문이 5번 출력 됨
			}
		}

	}
}
