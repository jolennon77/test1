package selfexam;

import java.util.Scanner;

public class SelfExam14 {

	public static void main(String[] args) {
	
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("영단어 입력");
	int num = scanner.nextInt();
	
	
	int num1 = 1;
	
	
	while (num1<=num) {
		if(num%num1 ==0) {System.out.println(num1);
	}
	num1++;
	}}}