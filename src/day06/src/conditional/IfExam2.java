package conditional;

import java.awt.GraphicsDevice;
import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {

		// 고객의 포인트가 20 이상이면 vip 20미만 10이상이면 gold 10미만이면 일반으로 출력

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자입력");
		int num = scanner.nextInt();
		
		
		if (num%2 == 0 || num%3 ==0) { num = num + 1000;
			
		} else {
			 num = num + 5000;
		}

		System.out.println(num);
	}
}
