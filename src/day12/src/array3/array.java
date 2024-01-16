package array3;

public class array {
public static void main(String[] args) {
	
	
//	int[] name = new int[]
//	int[0][0] = 5;
	
	
	
	int[][] num = new int[2][];
	num[0] = new int[3];
	num[1] = new int[3];
	
	
	
	num[0][0] = 5;
	num[0][1] = 10;
	num[0][2] = 15;
	num[1][0] = 20;
	num[1][1] = 25;
	num[1][2] = 30;
	
	
	
	for (int r = 0; r < num.length; r++) {
		for (int c = 0; c < num[r].length; c++) {
			System.out.println(num[r][c]);			
		}
	}
	System.out.println("---------------------------------------------------------");
	
	//int[] score = new int[](10,20,30}
	int[][] score = new int[][] {
		{10,20,30},
		{40,50,60}
	};
		
	for(int r = 0; r<score.length; r++) {
		for (int c = 0; c < score[r].length; c++) {
			System.out.println(score[r][c]);
		}
	} 
	System.out.println("---------------------------------------------------------");
	
	
	int[][] score2= {
			{10,20,30},
			{40,50,60}
			
	};
	for (int r = 0; r < score2.length; r++) {
		for (int c = 0; c < score2[r].length; c++) {
			System.out.println(score2[r][c]);
			
		}
		
	}
	}
}
