package arrayRework;

import java.util.Arrays;

public class arrayRework_3 {

	public static void main(String[] args) {

		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
	System.out.println("초기 배열");
	System.out.println(Arrays.toString(num));
	
	
	
	for (int i = 0; i < 100; i++) {
		int temp = 0;
		int k = (int)(Math.random()*10);
		
		temp = num[0];
		num[0] = num[k];
		num[k] = temp;
		
	}
		
		
	

	
	
	System.out.println("변경 배열");
	System.out.println(Arrays.toString(num));
	}
}
