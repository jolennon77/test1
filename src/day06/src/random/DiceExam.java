package random;

public class DiceExam {

	public static void main(String[] args) {
//		Math.random(); : 0.0이상 1.0 미만 범위 실수 값 발생
//						 0.0 <= 랜덤 <1.0
//						정수 랜덤 값 출력
//						(int)Math.random()
//						((int)Math.random()*출력범위(갯수)) +시작
//						ex : ((int)Math.random()*6) -----> 0,1,2,3,4,5 중 하나의 숫자
//						     ((int)Math.random()*6) +1 -----> 1,2,3,4,5,6 중 하나의 숫자
		
		
		double r = Math.random();
		int iran = (int)r;						//00
		int iran01 = (int)(Math.random()*5);	//0
		int iran02 = (int)(Math.random()*5);	//0이상 6미만
			//1이상 6미만
		int iran04 = (int)(Math.random()*10);	//
		
		System.out.println(r);
		System.out.println(iran);
		System.out.println(iran01);
		System.out.println(iran02);
//		System.out.println(iran03);
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("주사위눈");
		System.out.println();
		
		int dice = (int)(Math.random()*6)+1;
		
//		if (dice==1) {
//			
//		} else {
//
//		}
		System.out.println("주사위 눈 : " + dice);
		
	}

}
