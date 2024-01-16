
package variable1;

public class VariableExam03 {

	public static void main(String[] args) {

		
		String name = "이름";
		String kor = "국어";
		String eng = "영어";
		String mat = "수학";
		String sum = "수학";
		String avg = "수학";
				
		
		String name1 = "홍길동";
		int korScore = 80;
		int engScore = 70;
		int matScore = 90;
		
		int sumScore = korScore+engScore+matScore;
		int avgScore = sumScore/3;
		
		
//		System.out.println(" ** "+ name1 + "의 중간고사 성적 **");
//		System.out.println("============================================");
//		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+"합계"+"\t"+"평균");
//		System.out.println("============================================");
//		System.out.println(name1+"\t"+korScore+"\t"+engScore+"\t"+matScore+"\t"+(korScore+engScore+matScore)+"\t"+((korScore+engScore+matScore)/3));
//		System.out.println("============================================");
			
		System.out.println(" ** "+ name1 + "의 중간고사 성적 **");
		System.out.println("============================================");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+avg);
		System.out.println("============================================");
		System.out.println(name1+"\t"+korScore+"\t"+engScore+"\t"+matScore+"\t"+sumScore+"\t"+avgScore);
		System.out.println("============================================");
		
	}

}
