package loop;

public class ForExam3 {
		
	public static void main(String[] args) {
	
		
	       int startDan = 2; // 구구단 시작 
	        int numOfDans = 3; // 출력할 단의 개수 
	        int dan = 0 ;  
	        
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 0; j < numOfDans; j++) {	 //j가 0~2까지 -> dan => 2,3,4 
	                dan = startDan + j; 
	                System.out.print(dan + " * " + i + " = " + dan * i + "\t");
	            }
	            System.out.println();
	            }
	}
}