package exam;

public class BookExam4_4 {

	public static void main(String[] args) {

		int x= 0;
		int y= 0;
		

		for (x = 1; x <= 10; x++) {			
//			System.out.print("x = " +x);//x= 1
			for (y = 1; y <= 10; y++) {
//				System.out.print(" y = " +y);
				int result= 4*x + 5*y;
				if (result == 60) { 
					System.out.println("(" + x+", "+y+")");
				}
			}	
		}
}
}