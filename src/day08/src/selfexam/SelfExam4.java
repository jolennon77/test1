package selfexam;

import java.util.Random;

public class SelfExam4 {

	public static void main(String[] args) {

//		int Dice1 = (int)(Math.random()*5)+1;
//		int Dice2 = (int)(Math.random()*5)+1;
		
		for (int num1 = 1; num1 < 6; num1++) {
			for (int num2 = 1; num2 < 6; num2++) {
				if(num1+num2 == 6) {System.out.println("("+ num1 +","+num2+")");
			}			
		}
		}
	}
}
