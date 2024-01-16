package method;

import java.util.Scanner;

public class MethodExam5 {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static int add(int a, int b) {
	        return a + b;
		
	}
		
		
	public static void main(String[] args) {
        System.out.print("num1 : ");
        int num1 = scanner.nextInt();

        System.out.print("num2 : ");
        int num2 = scanner.nextInt();

        int result = add(num1, num2);

        System.out.println("Sum: " + result);
	
}
}