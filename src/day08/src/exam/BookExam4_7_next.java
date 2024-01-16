package exam;

import java.util.Scanner;



public class BookExam4_7_next {
	

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
//			String menuSelectNum = scanner.next(); // 수정할 부분
			String selectString = scanner.next();
			
			
			//선택한 번호를 이용해 처리
			switch (selectString) {
			case "1": 
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case "2": 
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case "3": 
				System.out.println("잔고> "+balance);
				break;
			case "4": 
				//while 문을 종료 run 값인 트루를 펄스로 변경
				run = false;
				break;
			} // end of switch
			System.out.println();
		} //end of while
		System.out.println("프로그램 종료");
	}	
}			
			//		select = scanner.nextInt();
//		}
//		switch (select) {
//		case 1:
//			System.out.print("예금액>");
//			deposit = scanner.nextInt();
//			balance += deposit; 
//			break;
//		case 2:
//			System.out.print("출액>");
//			deposit = scanner.nextInt();
//			balance -= deposit; 
//			break;
//		case 3:
//			System.out.print("잔고>");
//			System.out.println(balance);
//			break;
//		case 4:
//
//			System.out.println("프로그램 종료");
//			break;
//		default: ;
//			break;
//		}
//		
//		}
//		
//	}
	

