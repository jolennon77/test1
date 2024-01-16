package array;

import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;

public class ArrayExam {

	
	public static void extracted(int[] kor, int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(kor[i]);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] kor = new int[3]; 		//힙 영역에 정수형을 담을 수 있는 공간을 3개 확보하고
		int length = kor.length;		//kor라는 변수에 그 주소를 알려주시
										//힙에는 비어있는 변수나 객체를 만들 수 없다. 그래서 jvm은 공간을 만들고 값이 없으면 기본값으로 초기화를 시켜준다.
										//int=0 long = 0L double = 0.0, float = 0.0f
										//boolean = false
										//참조형(String)은 null 로 초기화 시켜줌
		
		kor[0] = 70;
		kor[1] = 90;
		kor[2] = 85;

		
		int[] kor1 = new int[] {70,90,85};
		
		extracted(kor, length);
		
		
		
		//Arrays.toString(배열의 참조변수) //배열 확인 
		
		System.out.println(Arrays.toString(kor)); 
		
	} // end of main


}
//
//
//
//타입[] 변수명;
//변수명 = new 타입[공간의 크기]
//		int[] num;
//		num = new int[3];


//타입[] 변수명 = new 타입[공간의 크기]
//int[] score = new int[3]
//			
////		타입[]변수명 = New 타입[] {값1,값2}
////							주의 []안에 공간 크기를 적지 않음 뒤에 중 가로에서 크기를 알려주기에
////							int[] num = new int[] {10,20,30}
////
////							타입[]변수명= {값1,값2}
//							int[] score = {10,20,30}
//							주의 아래와 같이 선언 할 수 없음
//							타입[] 변수명 ;
//							변수명 = {값1,값2,}
//							
//							
//							
//						new 키워드
//						
//						heap 메모리에 공간 을 만들라는 의미
//						jvm이 비워 있는 공간 객체를 생성하고 어느 공간에넣었는지 알 수 없기에
//						jvm은 객체의 위치정보를리턴해줌따라서 참조변수에는 객체의 주소가 담김
//						
//						
//						배열의 초기화
//						배열은선언시 값을 넣지 않으면 자동으로 초기화 
//						왜냐하면 힙 영역은 비어있는 객체는 담을수 없기때문


