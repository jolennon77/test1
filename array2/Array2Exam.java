package array2;


public class Array2Exam {

	public static void main(String[] args) {

//		int score[] = {100, 88, 100, 90, 50};
//		int sum = 0;
//		
//		
//		for (int i = 0; i < score.length; i++) {
//		sum+= score[i];
//		
//		
//		}
//		int avg = sum/score.length;
//		
//		
//		System.out.println(score.length);
//		System.out.println(sum);
//		System.out.println(avg);
		
		
		int score[] = new int[45];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = i+1;
			
		System.out.println(score[(i++)]);
	}
		
		
	}

}
