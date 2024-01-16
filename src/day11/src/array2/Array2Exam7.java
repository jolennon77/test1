package array2;

import java.util.Arrays;
import java.util.Iterator;

public class Array2Exam7 {

	public static void main(String[] args) {
	//0-9까지의 숫자를 임의로 출력
	//1. 임의로 -math.random(),
		
		
// 	int num = (int)(Math.random()*10);
	
	
	int num[] = {1,2,3,4,5,6,7,8,9,10};	
	
	System.out.println("변경 전 : " + Arrays.toString(num));
	//배열에 담긴 값 섞기
	for(int i = 1; i <=100; i ++){
		//임의로 변경되는 0 ~ 9 사이 인덱스 번호 만들기
		int iNum = (int)(Math.random() *10); //임의의 인데스
		int temp = 0;
	
		
		//0번째 요소 값과 n번째 요소의 값 바꾸
		temp = num[0];
		num[0] = num[iNum];
		num[iNum]= temp;
		
		
		for(int k=0; k<num.length; k++)
		{System.out.println(num[k]);
		} //end of for
		
	}	//end of for

	System.out.println("변경 후 : " + Arrays.toString(num));
	
	
	
	}
}
