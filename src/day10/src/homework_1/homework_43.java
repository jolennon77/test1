package homework_1;

public class homework_43 {

	public static void main(String[] args) {

		hellojava();
		System.out.println(add(1, 2));
		System.out.println(add1(1, 2, 3));
		System.out.println(multDouble(1.1, 2.0));
		System.out.println(add3(1, 2.0));
	}

//----------------------------------------------
	public static void hellojava() {
		String str = "Hello Java";

		for (int i = 0; i < 3; i++) {
			System.out.println(str);
		} // 3번 문자열 출력을 반복
	}

	// hellojava(); 로 출력
//----------------------------------------------

	public static int add(int a, int b) {
		return a + b;
		// 출력 -> System.out.println(add(1, 2));
	}

	public static int add1(int a, int b, int c) {
		return a + b + c;
		// 출력 ->

	}

	public static double multDouble(double a, double b) {
		return a + b;
	}

	public static double add3(int a, double b) {
		return a + b;
	}
}