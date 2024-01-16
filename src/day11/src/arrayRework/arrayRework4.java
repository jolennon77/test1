package arrayRework;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		
		//배열 숫자 할당
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
			
			
			
		}
		System.out.println(Arrays.toString(number)); //초기 배열
		
		
		
		//섞어주기
		//임의로 변경되는 0 ~ 9 사이 인덱스 번호 만들기
		for(int i = 1; i <=100; i ++){
		int randomIndexNum = (int)(Math.random() *10);
		int temp = 0;
		
		temp = number[0];
		number[0] = number[randomIndexNum];
		number[randomIndexNum]= temp;
		
		}
		
		
		
		
		System.out.println(Arrays.toString(number)); // 랜덤 배열



	}// end of main
}
