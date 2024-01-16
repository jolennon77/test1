package method;

import java.util.Scanner;

public class MethodExam4 {

	
	public static void pint() {
		
		Scanner scanner = new Scanner(System.in);
		int reminPaper = 100;
        int printPage = 0;
        int select = 0;

        System.out.println("출력할 페이지 수 입력");
        printPage = scanner.nextInt();

        System.out.println("1.단면 or 2.양면");
        select = scanner.nextInt();
        
        if (reminPaper<printPage/2) { 
        	 System.out.println("용지가 부족합니다. 용지를 보충 해주세요");
        	 }
        else {if (select == 1 && printPage%2 == 0 ) {
        	System.out.println("인쇄를 시작합니다. 남은 용지 : " + (reminPaper - printPage));
		}
        else {if (printPage%2==0) {System.out.println("인쇄를 시작합니다. 남은 용지 : " + (reminPaper - (printPage/2)));
			
		} else {if (printPage%2!=0) {System.out.println("인쇄를 시작합니다. 남은 용지 : " + (reminPaper - (printPage/2)-1));

		} 
			
		}
			
		}
        }
        
        
//        if (reminPaper < printPage/2) {
//            System.out.println("용지가 부족합니다. 용지를 보충 해주세요");
//        } else {
//            if (select == 1) {
//                System.out.println("인쇄를 시작합니다. 남은 용지 : " + (reminPaper - printPage));
//            } else {
//                // Corrected the logic here for double-sided printing
//                System.out.println("인쇄를 시작합니다. 남은 용지 : " + (reminPaper - printPage / 2));
//            }
//			
//		}
		
	}
	
	public static void main(String[] args) {
	pint();
	

}
}