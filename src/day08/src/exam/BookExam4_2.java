package exam;

import java.util.Iterator;

public class BookExam4_2 {

	public static void main(String[] args) {

		int sum = 0;
		//숫자%3=0 <- 3의 배수
		
//		for (int i = 0; i <= 100; i++) {
//			
//			if (i%3 == 0) { sum +=i;
//			}
//			
//		}
		
		for (int i = 0; i <= 100; i++) {
			
			if (!(i%3 == 0)) { 
				continue;
			}
			sum += i;
		}
		
		
		System.out.println(sum);
	}

}
