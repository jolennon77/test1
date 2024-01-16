package type;

public class TypeExam01 {

	public static void main(String[] args) {

		byte bValue = 50;
//		byte bValue1 = 129;
	
		short sValue = 32760;
//		short sValue1 = 32768;
		
		
		
		int iValue = 56;
		int iValue1 = 2_000_000_000;
		
		long lValue = 35;
		
		float fValue = 3.5f;
		
		System.out.println(fValue);
		
		byte a = 3;
		byte b = 0;
		// a = b + bValue; // 에러 byte short int 연산시 = > int 타입 변경 아래 두 방법처럼 변경 해야 함
		a = (byte) (b + bValue);
		
		int a_ = 3;
		a_ = b + bValue;
		
		
		char cValue = ' '; //char 타입은 따옴표 가운데 한칸을 비어야 됨 <-비교-> String value = ""
		char a1 = 65;
		char a2 = 'A';
		cValue = 'A' + 1;
		int b1 = a1 + 1;
		
		 
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(cValue);
		System.out.println(b1);
		
		double avg = 35 / 3 ;
//		int sum = 35.0 / 3 ; 
//		정수타입 = 실수타입 -> 에러 
		
		
		double sum = 35.0 / 3 ; 
//		int sum = (int)(35.0 / 3 );  --> 강제 형변환 down casting (자료 손실 있음)
		
//		자동 타입변환 : 자바는 등호를 기준으로 왼쪽과 오른쪽의 타입이 동일 해야함!
//						작은 타입이 큰 타입으로 자동 변경
//						정수형(byte, short, char, int)은 산술연산을 하면 자동으로 int 타입으로 변환
//		강제 타입 변환 : 타입 변환 연산자를사용해데이터 타입을 강제로 변환하는 연산
//						 강제적으로 큰 데이터를 작은 데이터 타입으로 쪼개서 저장하기에 데이터 손실이 발생 할 수 있다.
//						 타입변환 연산자 ex-> 작은크기타입 = (작은크기타입) 큰 크기 타입
						 
//						 문자열을 일반 자료형으로 변환 가능!
//						 ex) String "100" -> int 100
						 System.out.println(Integer.parseInt("100"));
						 System.out.println(Double.parseDouble("54.33"));
//		
//		변수 와 상수 : 변수 = 하나의 값을 저장 하는 공간, 가장 마지막에 들어온 값을 저장
//					   상수 = 처음 값을 저장하면 바꿀 없다. 처음 한번만 저장 할 수 있고 변수와 같이 중간에 변경 할 수 없음
//					   		  처음 선언 한 곳에서만 변경 가능 
//					   		  자바에서는 상수에는 final 분히고 상수명을 대문자로 표
//					   		  ex ) final 타입 상수명 = 값;
//					   		  	   final double PI = 3.141592;
//					   		  	   final int HEIGHT;
//					   		  	   HEIGHT = 20;
//						 
//		literal(리터럴) : 그 자체로 값을 의미 하는 것
		
//		서식문자 pintf = %d : 10진 정수(decimal) 정수형식으로 출
//						 %c : 문자(character)로 출
//						 %s : 문자열(string)로 출력
//						 %f : 부동 소수점(floating-point)형식으로 출력
//						 	  %전체 자릿수. 소숫점 아래 자리수f -> %3.2f
						
						 

						 
						 int kor = 90;
						 String name = "홍길동";
						 String name1 = new String("홍길동");
						 
						 System.out.println(kor == 90);
						 System.out.println(name == name1);
						 System.out.println(name.equals("홍길동"));
	}
}
