package conditional;

import java.awt.GraphicsDevice;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class IfExam3 {

	public static void main(String[] args) {

		// 고객의 포인트가 20 이상이면 vip 20미만 10이상이면 gold 10미만이면 일반으로 출력

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자입력");
		int num = scanner.nextInt();
		String result = "";
		
		
		if (num%2 == 0) { result = "A class";
			
		} else {
			result = "B class";
		}

		System.out.println(result);
	}
}
