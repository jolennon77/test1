package selfExam;

public class Method2 {

//1. 매개변수가 없고 반환값이 없는 메소드
	public static void method1() {
//아무 값도 반환하지 않고 메소드 내용만 수행한 후 리턴값이 없이 호출한 메소드로 돌아간다.
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		return; // 모든 메소드에 생략되어 있음(JVM이 자동 생성)
	}

//2. 매개변수가 없고 반환값이 있는 메소드
	public static String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}

//3. 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {
//호출하는 쪽의 괄호에 인자로 넘긴 값을 받기 위해 선언하는 것이 매개변수이며
//메소드 선언 시 괄호 안에 변수를 선언하여 메소드 내에서 사용한다.
		int sum = num1 + num2;
		System.out.println("sum : " + sum);

		return;
	}

//4.매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}
	
	
//	public 		static 	 void 	name	(        ){
//	[접근제한자][예약어] 반환형 메소드명(매개변수){ 
//	    //실행내용 작성 
//	}

	
//	 오버로딩
//		한 클래스 내에서 파라미터선언부(매개변수)가 다르고, 이름이 같은 메서드를 여러 개 정의하는 것.
	
//	 오버로딩 성립조건
//		메소드 이름이 같아야한다.
//		매개변수 선언부가 달라야한다.
//		매개변수 타입, 개수 , 순서
//	 오버로딩 주의점
//		매개변수명은 상관치 않는다.
//		리턴타입은 오버로딩시 상관치 않는다.
	public static void main(String[] args) {
	
		method1();
		System.out.println(method2());
		method3(1, 2);
		System.out.println(method4(1, 2));
		
}
		
	}
