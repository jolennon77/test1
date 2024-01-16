package exam;

public class BookExam4_3 {

	public static void main(String[] args) {

		double r = Math.random();
		int i = 0; // 주사위 던지는 수 변
		int diceX = 0; // 주사위 1
		int diceY = 0; // 주사위 2
		int sum = 0;
		int result = 0;
		
//		while (true) {
//			 diceX = (int)(Math.random() * 5) + 1;
//			 diceY = (int)(Math.random() * 5) + 1;
//			 
//			 sum = diceX + diceY;
//			 System.out.println("("+diceX+ ", " +diceY +(")"));
//			 
//			 if(sum!=5) {
//				 continue;
//				 
//			 }
//			 {break;}
//		}
		
		while (true) {
			 diceX = (int)(Math.random() * 5) + 1;
			 diceY = (int)(Math.random() * 5) + 1;
			 
		
		System.out.println("("+diceX+ ", " +diceY +(")"));
		result = diceX + diceY;
		
		
		
		if(result == 5) {
			break;
		}
		
		}
		
	}

}
