package homework_1;

public class homework_42 {

	public static void main(String[] args) {

		int sum = 0; // 합계 변수
		int number = 1; // 덧셈시작 숫자

		while (number <= 10) {
			if (number % 2 == 0) {
				number++;
				continue; // 짝수이면 숫자를 1올리고 조건문으로 다시 돌아감
			}

			sum += number; // 홀수이면 더하고 숫자를 1올리고 다시 조건문으로 돌아감
			number++;
		}

		System.out.println("1부터 10까지의 홀수의 합: " + sum);
	}
}