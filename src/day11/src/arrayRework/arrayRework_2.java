package arrayRework;

import java.util.Iterator;

import javax.xml.stream.events.EndDocument;

public class arrayRework_2 {

	public static void main(String[] args) {
	
		int score[]= {100, 88, 100, 90, 50};
		String name[] = {"홍길동","김자바","이자바","박디비","송디비"};
		int sum = 0;
		double avg = 0;
		
		System.out.println("번호\t이름\t\t성적");
		System.out.println("==========================================");

		for (int i = 0; i < name.length; i++) {
			System.out.println(i+1+".\t"+name[i] +"\t\t"+ score[i]);
			sum += score[i];
		} // end of for
			avg = (double)sum/score.length;
			
		System.out.println("==========================================");
		System.out.println("인원수 : "+score.length);
		System.out.println("전체 합계 : "+sum);
		System.out.println("전체 평균 : "+avg);

	}
}
