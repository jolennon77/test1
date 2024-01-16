package conditional;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//스캐너 클래스 사용 스캐너 객체 생성	
		
													// 변수 설정
		String recommend = "";						// 추천장소
		System.out.println("당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요. (산/바다) >> "); 	
		String result = scanner.next();
		
		
		if (result.equals("산")) { recommend = "한라산";
			
		} else {recommend = "동해";}
		
		
		
		
		if (result.equals("산") || result.equals("바다")) {
			System.out.printf("당신이 선택한 여행 희망지는 \'%s\'입니다.\n당신에게 추천하는 곳은 \'%s\'입니다.", result,recommend);
			
		} else {
			System.out.println("올바른 값을 입력 하세요");

		}

		
		
		//		System.out.printf("당신이 선택한 여행 희망지는 %s입니다.\n당신에게 추천하는 곳은 %s입니다.", result,recommend);
		
		
		
		
	}
}