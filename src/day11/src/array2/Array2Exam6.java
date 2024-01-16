package array2;

public class Array2Exam6 {

	public static void main(String[] args) {
	
	int num[] = new int[10];
	
	
	for (int i = 0; i < num.length; i++) {
		num[i] = i+1; 
	}
	
	System.out.println(num[(int)(Math.random()*10)+1]);
	
	

	}
}
