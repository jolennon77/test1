package homework_1;


public class homework_40 {

	public static void main(String[] args) {
		 
		double r = Math.random();
		int i = 0; // 주사위 던지는 수 변
		int diceX = 0; // 주사위 1
		int diceY = 0; // 주사위 2

		while (i < 5) { // i= 0,1,2,3,4(5번) 주사위 던지고
			diceX = (int) (Math.random() * 5) + 1; // 난수1 추출
			diceY = (int) (Math.random() * 5) + 1; // 난수2 추출
			System.out.print("(" + diceX + ", " + diceY + ")"); // 실행문
			i++; // 증감식
			System.out.println();
		}

	}

}

