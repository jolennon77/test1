package homework_1;


public class homework_39 {

	public static void main(String[] args) {
		 
		
		int x= 0;
		int y= 0;
		

		for (x = 1; x <= 10; x++) {			
			for (y = 1; y <= 10; y++) {
				int result= 4*x + 5*y;
				if (result == 60) { 
					System.out.println("(" + x+", "+y+")");
				}
			}	
		}
}
}
	
