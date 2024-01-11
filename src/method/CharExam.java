package method;

public class CharExam {

	public static void main(String[] args) {
		
		
		String nameString = "홍길동";
		String passwodString = "ghdrlfehd";
		String encryptedPassword =  "";
		String decryptedPassword =  "";
		final int KEY_VALUE = 3;
		
		
		
		//정수 +정수 - > 정수
		//정수 연산자 실수 -> 실수

		//문자 정수 -> 정수 (자동타입변환 , 유니코드)
		//(char)(문자 + 정수) => 문자 : 명시적 타입변환 (=강제형변환)
		//(char)(문자 연산자 정수) =>문자 :명시적 타입변환 (=강제형변환)
		
		
		//1.암호화
		//문자열 길이 :  문자열.length()
		for(int i =0; i <passwodString.length(); i++) {
			encryptedPassword = encryptedPassword+(char)(passwodString.charAt(i)*KEY_VALUE);
			
		}
		System.out.println(passwodString);
		System.out.println(encryptedPassword);
		
		
		//1.암호화
		//문자열 길이 :  문자열.length()
		for(int i =0; i <encryptedPassword.length(); i++) {
			decryptedPassword +=(char)(encryptedPassword.charAt(i)/KEY_VALUE);
			
		}
		System.out.println(passwodString);
		System.out.println(decryptedPassword);

	}
}