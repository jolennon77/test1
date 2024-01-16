package random;

import java.util.Scanner;

public class SelfExam1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		String grade = ""; 
		int point = 0;
		
		System.out.println("포인트를 입력 하세여");
//		point = scan.nextInt();
		point = Integer.parseInt(scan.next());
//		
//		if(point>=20) {
//			grade = "VIP";  //System.out.println("VIP");	
//		}else if(point>=10) {
//			grade = "GOLD";
//		}else {
//			grade = "일반회원";
//		}
//		
//		System.out.println(grade);	
		
		switch (point) {
		case 0,1,2,3,4,5,6,7,8,9 : System.out.println("일반회원");
			
			break;
		case 10,11,12,13,14,15,16,17,18,19 : System.out.println("일반회원");
		
		break;
	
		default: System.out.println("VIP");
			break;
		}
		
		
	}

}
