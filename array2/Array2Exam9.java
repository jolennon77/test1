package array2;

import java.util.Arrays;
import java.util.Iterator;

public class Array2Exam9 {

	public static void main(String[] args) {
		
//		향상된 for 문
//			배열 또는 컬렉션과 같이 다수의 요소를 가지고 있는 객체에서 원소를 하나
//			차례로 꺼내는 기능을 반복적으로 수행
//			
//			for(꺼내올 요소의 타입 변수명 : 배열명 또는 컬렉션 명) {실행할 문장들}
		

		int[] arr = new int[3];
		
		//for문 사용
		for(int i = 0; i <arr.length; i++){        
			System.out.println(arr[i]);
		}
//		
//		for (int num : arr) {
//			System.out.println(arr[num]);
//			
//		}
//		System.out.println(Arrays.toString(arr));
	}
}
