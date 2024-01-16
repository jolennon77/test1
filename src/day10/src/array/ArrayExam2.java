package array;

import java.util.Arrays;



public class ArrayExam2 {

	
	public static void extracted(int[] kor, int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(kor[i]);
			
		}
	}
	
	
	public static void main(String[] args) {
	int[] kor = {70,90,85};
	
	System.out.println(kor[1]);
	System.out.println(Arrays.toString(kor)); 
	
	
	String[] kor1 = new String[4];
	
	
	System.out.println(Arrays.toString(kor1)); 
	kor1[0] = "1";
	kor1[1] = "2";
	kor1[2] = "3";
	System.out.println(Arrays.toString(kor1)); 
	
	
	} // end of main


}

