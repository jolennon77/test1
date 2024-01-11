package method;

import java.util.Scanner;

public class MethodExam11 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void pint(int printAmount, int printingMethod) {
		int paperNumber = 100; // 초기용지
		
		if(printingMethod == 2) {printAmount = (printAmount % 2 == 0)? printAmount/2 : printAmount / 2+1;
		
	}
		if (paperNumber==0) {
			System.out.println("용지 없음");
		}else if (paperNumber<printAmount) {
			System.out.println("용지 부족 : " + (printAmount- paperNumber));
			System.out.println(paperNumber + "장만 인쇄");
			paperNumber = 0; //기본용지를 0으로 설정
		}else {
			paperNumber -=printAmount;
			System.out.println(printAmount+"장출력");
			System.out.println("남은 용지 매수 : " + paperNumber);
		}
	
	}
	//start of main
	public static void main(String[] args) {
		
        System.out.println("1.단면 or 2.양면");
       int printingMethod = scanner.nextInt();
        
        System.out.println("출력할 페이지 수 입력");
        int printAmount = scanner.nextInt();

        pint(printAmount, printingMethod);
}
}