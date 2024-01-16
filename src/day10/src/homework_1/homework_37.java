package homework_1;


public class homework_37 {

	public static void main(String[] args) {
		 
		
		int startMultip = 2;
	        int endMultip = 4;

	        for (int i = 1; i <= 9; i++) {
	            for (int j = startMultip; j <= endMultip; j++) {
	                int result = j * i;
	                System.out.print(j + " * " + i + " = " + result + "\t");
	            }
	            System.out.println();
	        }
	    }
	}