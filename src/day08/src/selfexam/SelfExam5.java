package selfexam;

import java.util.Random;

public class SelfExam5 {

	public static void main(String[] args) {

		for (int x = 0; x <= 10; x++) { 				// x 0부터 시작
			for (int y = 0; y <= 10; y++) { 			// y 0부터 시
				if (2 * x + 4 * y == 10) { 				// false면 if 밖의 for 문으로 돌아감 그래서 x 0 y 0~10까지 비교
					System.out.println(x + "," + y); 	// 출력 명령 실행 그후 첫번째 for 문으로 가서 x 1증가 후 x가 10이 될때까지 반복

				}
			}

		}

	}
}
