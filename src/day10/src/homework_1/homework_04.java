package homework_1;

public class homework_04 {

	public static void main(String[] args) {

		// 변수 설정

		String subject_1 = "엑셀"; // 과목1
		String subject_2 = "자바"; // 과목2
		String subject_3 = "파이썬"; // 과목3
		String testTaker = "김자바"; // 시험응시자명

		int subject_1_Score = 76; // 과목1 성적
		int subject_2_Score = 98; // 과목2 성적
		int subject_3_Score = 50; // 과목3 성적

		int total_Score = subject_1_Score + subject_2_Score + subject_3_Score; // 전체 과목 합계
		double avg_Score = total_Score / 3.0; // 과목 평균

		System.out.println("-----------------------------------------------");
		System.out.println("이름" + "\t" + subject_1 + "\t" + subject_2 + "\t" + subject_3 + "\t" + "총점" + "\t" + "평균");

		System.out.println("-----------------------------------------------");
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%s\t\n",testTaker,subject_1_Score,subject_2_Score,subject_3_Score,total_Score, String.format("%,.3f", avg_Score) );
		System.out.println("-----------------------------------------------");

	}

}