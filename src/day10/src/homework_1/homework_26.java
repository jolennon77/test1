package homework_1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("##,#0.00");
			
		//변수 설정
		System.out.println("이름을 입력하세요.");
		String name = sc.next();
		
		System.out.println("국어 점수를 입력하세요.");
		int kor = sc.nextInt();	
		
		System.out.println("영어 점수를 입력하세요.");
		int eng = sc.nextInt();	
		
		System.out.println("수학 점수를 입력하세요.");
		int mat = sc.nextInt();	
		
		
		int sum = kor + eng + mat;			//점수의 총합
		
		double avg = sum / 3.0 ;	//평균 변수 
		
		
		String result = "";
		
		if (avg>=80) {result = "합격";
		
		}else {result = "불합격";
			
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t판정\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t%s\t", name,kor,eng,mat,sum,f.format(avg),result);
		
	}
}
