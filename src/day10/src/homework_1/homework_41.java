package homework_1;


public class homework_41 {

	public static void main(String[] args) {
		 
		
		double r = Math.random();

		int diceX = 0;	//주사위1
		int diceY = 0;	//주사위2
		int sum = 0;	//주사위1,2값의 합

		while (true) {
			diceX = (int) (Math.random() * 5) + 1;	// 난수1
			diceY = (int) (Math.random() * 5) + 1;	// 난수2
			;
			sum = diceX + diceY;					// 난수1,2의 합
			System.out.println("(" + diceX + ", " + diceY + ")" + " 합계 = " + sum);

			if (sum == 5) {
				break;			//난수1,2의 합이 5면 정지 5가 아니면 while 문을 다시 실행
			}
		}
	}
}
	
