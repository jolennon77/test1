package homework_1;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력요청과 변수 설정
		System.out.println("삼각형의 밑변을 입력하세요");
		int base = sc.nextInt(); // 삼각형의 밑변 변수
		System.out.println("삼각형의 높이를 입력하세요");
		int height = sc.nextInt(); // 삼각형의 높이 변수

		//삼각형 넓이 변수 설정
		int triangleArea = base*height/2;
		
		System.out.println("삼각형의 밑변 :" + base);
		System.out.println("삼각형의 높이 :" + height);
		System.out.println("삼각형의 넓이 :" + triangleArea);


	}

}