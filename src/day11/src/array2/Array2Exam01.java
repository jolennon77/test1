package array2;

public class Array2Exam01 {

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
		int sum = 0;
		double avg = 0;
		

//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//			
//			System.out.println("score["+i+"] = "+ score[i]);
//
//		}
		
		for(int num : score) {
			System.out.print(num + " ");
		}
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];}
		
		avg = (double)sum / score.length;

		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		int max = score[0]; //최대값
		int min = score[0]; //최소값
		

		
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max = score[i];
			} else {min = score[i];
			
		}
			

	}
		System.out.println(min);
		System.out.println(max);
}
}
