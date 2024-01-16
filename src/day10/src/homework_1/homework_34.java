package homework_1;

public class homework_34 {

	public static void main(String[] args) {

		int result = 0;
		for (int i = 0; i <= 5; i++) {
			result += i;

		}

		System.out.println("1 ~ 100까지의 자연수 합 : " + result);

		result = 0;
		for (int i = 0; i <= 100; i++) {
			result += i;

		}

		System.out.println(result);

		// ----------------------------------
		result = 0;
		for (int i = 100; i >= 1; i--) {
			result += i;

		}

		System.out.println("100 ~ 1까지의 자연수 합 = " + result);

	}

}
