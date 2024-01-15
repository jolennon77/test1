package array2;

public class Array2Exam3 {

	public static void main(String[] args) {

//		-변수 설정 방법1-
//		int score[] = new int[5];
//		score[0] = 100;
//		score[1] = 99;
//		...
//		-변수 설정 방법2-

//		int[ ]score = new int[] { 100, 88, 100, 90, 50 };

//		-변수 설정 방법3-		
		int score[] = { 100, 88, 100, 90, 50 };
		String studentNames[] = { "홍길동", "김자바", "이자바", "박디비", "송디비" };

		int sum = 0;
		double avg = 0;
		int count = 0;

		int max = score[0];
//		max = 0;
//		max = Integer.MIN_VALUE; ;;

		int min = score[0];
//		min = 0;
//		min = Integer.MAX_VALUE; ;;

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				// max 변수에 담긴 값이 배열의 i 번째 요소값 보다 작으
				// max 변수에 i번째 요소의 값을 저장
				max = score[i];
			} // end of if

		} //end of for

		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				// max 변수에 담긴 값이 배열의 i 번째 요소값 보다 작으
				// max 변수에 i번째 요소의 값을 저장
				min = score[i];
			} // end of if

		} // end of for

		System.out.println(min);
		System.out.println(max);
	}

}
