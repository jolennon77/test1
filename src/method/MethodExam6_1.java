package method;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class MethodExam6_1 {

	static Scanner scanner = new Scanner(System.in);
	
	
	public static void add2() {
        System.out.print("num1 : ");
        int a = scanner.nextInt();

        System.out.print("num2 : ");
        int b =  scanner.nextInt();    

        System.out.print("num3 : ");
        int c = scanner.nextInt();    
        
        int Result = a+b+c;
        System.out.println("sum : "+Result);
        
		
	}
		
		
	public static void main(String[] args) {

			add2();


	}
}


