package conditional;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SelfExam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##,#0.00");
			
		
		System.out.println("1");
		String name = scanner.next();
		
		System.out.println("ss");
		int kor = scanner.nextInt();	
		
		System.out.println("ss");
		int eng = scanner.nextInt();	
		
		System.out.println("ss");
		int mat = scanner.nextInt();	
		
		
		int sum = kor + eng + mat;
		
		double avg = (double)sum / 3.0 ;
		
		
		String result = "";
		
		if (avg>=80) {result = "합격";
		
		}else {result = "불합격";
			
		}
		
		
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %s\t %s\t", name, kor,eng,mat,sum,f.format(avg),result);
		
	}
}
