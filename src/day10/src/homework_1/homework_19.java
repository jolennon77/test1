package homework_1;

import java.util.Scanner;

public class homework_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
																// 변수 설정
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();							// 이름
		System.out.println("전화번호를 입력하세요");
		String phoneNumber = sc.nextLine();						// 전화번호
		System.out.println("주소를 입력하세요");
		String Address = sc.nextLine(); 						// 주소
				
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("주소 : "+Address);
			
	}
}