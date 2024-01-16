package array;

public class ArrayExam22222222 {
	public static void main(String[] args) {

		// 이중배열

		int[][] scores = new int[2][3];

		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;

		scores[1][0] = 4;
		scores[1][1] = 5;
		scores[1][2] = 6;

		// 내용출
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);

			}
		}
	}
}
