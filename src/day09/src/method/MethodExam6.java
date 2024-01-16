package method;

import java.util.Scanner;

public class MethodExam6 {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static int add2(int a, int b, int c) {
        System.out.print("num1 : ");
        a = scanner.nextInt();

        System.out.print("num2 : ");
        b = scanner.nextInt();    

        System.out.print("num2 : ");
        c = scanner.nextInt();    
		
		return a + b + c;
		
	}
		
		
	public static void main(String[] args) {



        System.out.println(add2(0, 0, 0));
	
}
}