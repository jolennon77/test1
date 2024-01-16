package homework_1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
			
		int numRemain = num%2;		//스위치 문을 사용하기 위한 나머지 변수 설정 
		String Result = "";			//결과값 변수
		
		switch (numRemain) {		//나머지변수가 0이면 A  그외(1)이면 B
		case 0: Result = "A class";
			
			break;

		default: Result = "B class";
			break;
		}
		
		System.out.println(Result);
		
		
	}

}
