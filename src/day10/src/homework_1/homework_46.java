package homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class homework_46 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 변수 설정
		System.out.println("학생수 입력");
		int studentCnt = scanner.nextInt(); // 학생수 입력 변수 받기

		int[] studentNum = new int[studentCnt]; // 학생번호 배열 공간 생성

		for (int i = 0; i < studentNum.length; i++) {
			// 배열 값 담기 -> 배열은 0부터 시작 하기 때문에 +1하여 번호 1번으로 시작
			studentNum[i] = i + 1; // ex ) 학생수가 30명이면 i=30까지 for문 실행 i = 31이 되면 반복문 중

		}
		System.out.println("번호");
		System.out.println(Arrays.toString(studentNum));

	}

}
