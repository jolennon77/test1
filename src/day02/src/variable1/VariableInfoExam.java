

package variable1;


public class VariableInfoExam {

	public static void main(String[] args) {

		String subject_1 = "엑셀";
		String subject_2 = "자바";
		String subject_3 = "파이썬";
		
		String testTaker = "김자바";
		
		int subject_1_Score = 76;
		int subject_2_Score = 98;
		int subject_3_Score = 50;
		
		int total_Score = subject_1_Score + subject_2_Score + subject_3_Score;
		double avg_Score = total_Score/3.0;
		
		
		//System.out.print("%.3f",avg_Score);
		
		
		System.out.println("-----------------------------------------------");
		System.out.println(
							"이름" 		+"\t"+ 
							subject_1 	+"\t"+ 
							subject_2 	+"\t"+ 
							subject_3 	+"\t"+ 
							"총점" 		+"\t"+ 
							"평균"
							);
		// 정수 나누기 정수는 소숫점 버림

		
		
		System.out.println("-----------------------------------------------");
		System.out.print(
							testTaker 			+"\t"+ 
							subject_1_Score 	+"\t"+ 
							subject_2_Score 	+"\t"+ 
							subject_3_Score 	+"\t"+ 
							total_Score  		+"\t"
							);
		System.out.printf("%.2f",avg_Score); 
		System.out.print("\n");
		System.out.println("-----------------------------------------------");
		
		//System.out.printf("%.2f",avg_Score);
		
		
		//System.out.printf("%.5f",avg_Score); 
		
		
		System.out.println();
		System.out.println();
		System.out.println("================================================");
		
		
		
		
		
		
		System.out.printf(
						"%s\t %s\t %s\t %s\t %s\t %s\t\n", 
						"이름",subject_1,subject_2,subject_3,"합계","평균"
						);
		
		System.out.printf(
				"%s\t %d\t %d\t %d\t %d\t %.2f\t\n", 
				testTaker, subject_1_Score,	subject_2_Score, subject_3_Score, total_Score, avg_Score					
				);
		
		System.out.println();
		System.out.println();
		System.out.println("\t================================================");
		
		
		System.out.printf(
				"\t%s \t%s \t%s \t%s \t%s \t%s\n", 
				"이름",subject_1,subject_2,subject_3,"합계","평균"
				);

		System.out.printf(
				"\t%s \t%d \t%d \t%d\t%d \t%.2f\n", 
				testTaker, subject_1_Score,	subject_2_Score, subject_3_Score, total_Score, avg_Score					
				);
		
		
		System.out.println();
		
		System.out.println(  "\t\t\t" + "▢▢▢▢▢▢▢▢" + "▢▢▢▢▢▢▢▢" +"\n"+ 
						"\t\t"+"▢▢▢▢▢▢▢▢" + "\t\t" + "▢▢▢▢▢▢▢▢" +"\n" + 
						"\t"+"▢▢▢▢▢▢▢▢" +"\t\t\t\t"+ "▢▢▢▢▢▢▢▢" +"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						
						"\n" +
						"\t"+"▢▢▢▢▢▢▢▢" +"\t\t\t\t"+ "▢▢▢▢▢▢▢▢" +"\n" +
						"\t\t"+"▢▢▢▢▢▢▢▢" + "\t\t" + "▢▢▢▢▢▢▢▢" +"\n" + 
						 "\t\t\t" + "▢▢▢▢▢▢▢▢" + "▢▢▢▢▢▢▢▢" +"\n");
							
	}

}

				