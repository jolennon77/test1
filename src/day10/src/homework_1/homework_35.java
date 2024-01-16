package homework_1;


public class homework_35 {

	public static void main(String[] args) {

		
		int sumOdd = 0; // 짝수 합 변수값
		int sumEven = 0; // 홀수 합 변수
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOdd += i;
			} else {
				sumEven += i;
			}

		}

		System.out.println("1 ~ 100까지의 짝수의 합 = " + sumOdd);
		System.out.println("1 ~ 100까지의 홀수의 합 = " + sumEven);


	}

}
