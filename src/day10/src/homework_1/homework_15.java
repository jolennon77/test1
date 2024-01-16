package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정
		System.out.print("점수를 입력하세요 >>"); 
		int score = sc.nextInt(); 							//입력값 변수 저장

		
		String result = "";
		
		//조건문
		if(score >=70) {														//나머지 0 => 짝수
			result = "당신의 점수는 " + score+"점 입니다.\n이번시험에서 통과하였습니다.";	//트루값
		}else {
			result = "당신의 점수는 " + score+"점 입니다.\n이번시험에서 재수강하셔야 합니다.";	//폴스값
		}
		
		//결과 출력
		System.out.println(result);
		
		
		
		
		}

		
	
	
}