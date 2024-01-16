package arrayRework;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[45];
		
		//배열 숫자 할당
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
			
			
			
		}
//		System.out.println(Arrays.toString(number)); //초기 배열
		
		System.out.println("Lotto");
		System.out.println("번호1\t번호2\t번호3\t번호4\t번호5\t보너스");
		//섞어주기
		//임의로 변경되는 0 ~ 9 사이 인덱스 번호 만들기
		for(int i = 1; i <=100; i ++){
		int randomIndexNum = (int)(Math.random() *45);
		int temp = 0;
		
		temp = number[0];
		number[0] = number[randomIndexNum];
		number[randomIndexNum]= temp;
		
		}
		
		
		for (int i = 0; i < 6; i++) {
			
			

		System.out.print(number[i] + "\t" );
			
		}
			
//		System.out.println(Arrays.toString(number)); // 랜덤 배열
		
		



	}// end of main
}
