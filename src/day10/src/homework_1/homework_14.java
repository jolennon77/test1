package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정


		System.out.print("숫자를 입력하세요 >>"); 
		int num = sc.nextInt(); 							//입력값 변수 저장
		String result = "";
		
		//조건문
		if(num%2==0) {														//나머지 0 => 짝수
			result = "당신이 입력한 숫자는 " + num + "이고, 짝수 입니다.";	//트루값
		}else {
			result = "당신이 입력한 숫자는 " + num + "이고, 홀수 입니다.";	//폴스값
		}
		
		//결과 출력
		System.out.println(result);
		
		
		
		
		}

		
	
	
}