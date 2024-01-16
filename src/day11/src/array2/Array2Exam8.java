package array2;

import java.util.Arrays;
import java.util.Iterator;

public class Array2Exam8 {

	public static void main(String[] args) {
		// 0-9까지의 숫자를 임의로 출력
		// 1. 임의로 -math.random(),

// 	int num = (int)(Math.random()*10);

		int lotto[] = new int[45];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
//			System.out.println(lotto[i]);

		}

		System.out.println("변경 전 : " + Arrays.toString(lotto));

		for (int i = 1; i <= 100; i++) {
			// 임의로 변경되는 0 ~ 44 사이 인덱스 번호 만들기
			int iNum = (int) (Math.random() * 45); // 임의의 인데스
			int kNum = (int) (Math.random() * 45); // 임의의 인데스
			int temp = 0;

			temp = lotto[kNum];
			lotto[kNum] = lotto[iNum];
			lotto[iNum] = temp;

		} // end of for
		System.out.println("변경  : " + Arrays.toString(lotto));
		System.out.println();
		// 섞인 로또 번호

		for (int i = 0; i < 6; i++) {
			
			System.out.print(lotto[i]+" ");

		}
	}

}
