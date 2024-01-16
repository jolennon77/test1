package loop;

import java.util.Random;

public class ForExam7 {

	public static void main(String[] args) {

//		문9) 주사위 2개를 던져 나온 눈의 합이 5가 될때까지 실행 5가되면 멈춤

//	   while, break 활용
//	   (눈1, 눈2)
//	   출력형태) (1, 4), (2, 3), (3, 2), (4, 1).... 순서는 관계 없음

	       	int diceX = 0; // 주사위1
	        int diceY= 0; // 주사위2
	        int sum = 0; // 주사위1,2값의 합

	        while (true) {
	            diceX = (int)(Math.random() * 5) + 1; // 난수1
	            diceY = (int)(Math.random() * 5) + 1; // 난수2

	            sum = diceX + diceY; // 난수1,2의 합
	            System.out.println("(" + diceX + ", " + diceY + ")" + " 합계 = " + sum);

	            if (sum != 5) {
	                continue; // 난수1,2의 합이 5가 아니면 다음 반복으로 진행
	            }

	            // 난수1,2의 합이 5인 경우에만 아래 break로 while문 종료
	            break; 
	        }
	    }
	}