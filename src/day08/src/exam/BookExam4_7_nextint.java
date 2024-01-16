package exam;

import java.util.Scanner;



public class BookExam4_7_nextint {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;	//잔고
		
		while(run) {
			//-----------공통출력부분------------------
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			//-------------------------------
			
			//선택한 번호 읽어 오기
			int menuSelectNum = Integer.parseInt(scanner.nextLine()); // 수정할 부분
			//넥스트라인은 엔터를  가져가서 공백 까지 처리가되서
			//넥스트 라인을 쓰기위해서는 인티저퍼즈를 사용하여 전부 처리하면 에러가 사라짐
			
			//선택한 번호를 이용해 처리
			switch (menuSelectNum) {
			case 1: 
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2: 
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3: 
				System.out.println("잔고> "+balance);
				break;
			case 4: 
				//while 문을 종료 run 값인 트루를 펄스로 변경
				run = false;
				break;
			} //end of switch
			System.out.println();
		} //end of while
		System.out.println("프로그램 종료");
	}	//end of main
}			
