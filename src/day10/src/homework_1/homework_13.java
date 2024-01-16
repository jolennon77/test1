package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정


		System.out.print("이름을 입력하세요");
		String tester = sc.next(); 							//이름 입력값 변수 저장
		System.out.print("국어 점수를 입력하세요 >>"); 
		int kor = sc.nextInt(); 							//국어 성적 입력값 변수 저장
		System.out.print("영어 점수를 입력하세요 >>"); 
		int eng = sc.nextInt();								//영어 성적 입력값 변수 저장
		System.out.print("수학 점수를 입력하세요 >>"); 
		int math = sc.nextInt();							//수학 성적 입력값 변수 저장
		
		int sum = kor + eng + math;							//점수 총 합계
		double avg = sum/3.0;								//점수 평균 소숫점 표현을 위한 더블로 변수타입 설정 	
		
		
		
		//결과 출력
		System.out.println();
		System.out.println("** "+tester+"의 성적 **");
		System.out.println("이름 : "+tester);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+String.format("%.1f",avg));
		
		
		
		
		}

		
	
	
}