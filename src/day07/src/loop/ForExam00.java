package loop;

public class ForExam00 {
		
	public static void main(String[] args) {
//	반복문	
//		for
//		for (int i = 0; i < args.length; i++) { 실행문장 }
//			(타입 변수 = 시작값; 최종값; 증감값)
//		
//	이중 for문
//	for(초기값; 최종값(=조건); 증감값) {
//		for(초기값; 최종값; 증감값)
//		{실행문}
//	}
//	
//	while 문
//	조건이 맞지 않으면 실행 하지 않음 단 한번도 실행하지 않을 수 있음
//	시작값
//	while(조건=최종값) {조건이 true인 동
		
	int sum = 0;
	for(int i=1; i<=5; i++) {// i++ => i =i+1, i+=1
		sum = sum + i; // sum +=i
		System.out.println("합 = "+sum);}
	
}
}