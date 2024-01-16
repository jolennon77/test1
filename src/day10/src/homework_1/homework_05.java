package homework_1;

import java.util.Scanner;

public class homework_05 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//변수 설정
		String id = "";				//아이디
		String password = "";		//비밀번호
		String userName = "";		//이름
		String userPhoneNum = "";	//전화번호
		String userEmail = "";		//이메일
		
		//입력
		System.out.println("아이디를 입력하세요");
		id = sc.next();
		
		System.out.println("비밀번호를 입력하세요");
		password = sc.next();
		
		System.out.println("회원명을 입력하세요");
		userName = sc.next();
		
		System.out.println("전화번호를 입력하세요 >> 010-0000-0000형식");
		userPhoneNum = sc.next();
		
		System.out.println("이메일을 입력하세요");
		userEmail = sc.next();
		
		
		//출력
		System.out.println("* 회원가입 *");
		System.out.println("아 이  디 : "+id);
		System.out.println("비밀 번호 : "+password);
		System.out.println("회 원  명 : "+userName);
		System.out.println("전화 번호 : "+userPhoneNum);
		System.out.println("이 메  일 : "+userEmail);
		
		
	}

}