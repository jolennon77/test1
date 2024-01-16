package arrayRework;

import java.util.Arrays;
import java.util.Scanner;

public class arrayRework2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = { 79, 88, 33, 100, 50, 90 };
		int max = 0;
		int min = 999;

//		for (int i = 0; i < num.length; i++) {
//			if (max < num[i]) {
//
//				max = num[i];
//
//			} // end of if 1
//			if (min > num[i]) {
//				
//				min = num[i];
//			} // end of if 2
//			
//		} // end of for
//		
//		
//		
		//max min method 사용-----------------------------------------
		
		
		
		
		
		for(int i = 0; i <num.length; i++) {
			max = Math.max(max,num[i]);
		}
		for(int i = 0; i <num.length; i++) {
			min = Math.min(min,num[i]);
		}

		
		
		
		
		
		System.out.println(max);
		System.out.println(min);
	}//end of main
}
