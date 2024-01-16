package type;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		
													//예제 6 응용
		Scanner scanner = new Scanner(System.in);	//스캐너 클래스 사용 스캐너 객체 생성	
		
													// 변수 설정
		int apple = 0;								// 사과
		int pear = 0; 								// 배
		
		
		
		boolean booTrue = true;						// while문을 무한 반복해줄 true값을 가진 불린형 변수 (이해 못함 블로그 복붙함)
		String nInput;
		
		while(booTrue) {
			System.out.print("사과의 주문 수량을 입력하세요 >> ");
			apple = scanner.nextInt();
			System.out.print("배의 주문 수량을 입력하세요 >> ");
			pear = scanner.nextInt(); 												// 1. 처음 주문 수량 입력!
			

			System.out.printf("\n주문결과\n사과 : %d\n배 : %d\n",apple,pear);		// 2. 주문 결과 출력
			System.out.print("\n주문이 맞습니까? (Y/N) >> "); 						// 3. 주문 확인 입력 요구 <--- 대문자나 예 yes 등 여러변수도 가능하게 하고싶음
			
			
			nInput = scanner.next();												// 4. 값 입력받아서
		
			
			if(!nInput.equalsIgnoreCase("y")) {												// 5. 입력받은 값이 not y면 (false)  현재 소문자 y만 트루값
				continue ;															// 6. continue  를 사용해 반복문의 처음으로 돌아간다..
			}
			System.out.println("주문 감사합니다!");									// 7. 입력값이 y 면 주문 감사 메세지 출
				break;																// 8. break 로 반복문 중지
		}
	}
}