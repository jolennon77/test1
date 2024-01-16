package selfexam;


public class SelfExam7 {

	public static void main(String[] args) {

		
		//초기값1 마지막10 증가량 1 
		
		int sum = 0;
		for (int i = 1; i <11; i++) {
			for(int j = 1; j<i+1; j++) {
				sum += j;
				
				
			}
		}
	System.out.println(sum);
	}
}
