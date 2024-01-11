package method;

import java.awt.print.Printable;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class MethodExam2 {

	public static void helloJava(int a) {
		int sum = 0;
		for (int i = 0; i < a; i++) {
			System.out.println("hello java");
			
		}
	}
	
	public static void str(int num) {
		int sum = 1;
		while(sum <= num) {
			System.out.println("hello java");
			sum++;
		}
	}
	
	public static void pint() {
		
		Scanner scanner = new Scanner(System.in);
		int reminPaper = 100;
		int printPaper = 0;
		
		System.out.println("출력할 종이 수 입력");
		printPaper = scanner.nextInt();
		
		if (reminPaper<printPaper) {System.out.println("용지가 부족합니다. 용지를 넣어주세요");
			
		} else if(reminPaper<=printPaper){ System.out.println("인쇄를 시작합니다." + "남은 용지 : "+ (reminPaper - printPaper));
	
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
	helloJava(3);	
	pint();
	str(3);
	}

}
