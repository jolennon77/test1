package homework_1;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class homework_02 {

	public static void main(String[] args) {


		
		//변수 설정 및 초기
		String musicaiTitle	 = "";				//뮤지컬
		String musicalAudience = "";			//관람자 
		String musicalViewDate = "";			//뮤지컬 관람일
		int performanceTimeTotalminute = 0;		//공연 시간 분 <-수식으로 hh분 mm분으로 변환

		//변수 설정
		musicaiTitle = "시스터 액터";					
		musicalAudience = "홍길동";		
		musicalViewDate = "2024-01-02";			
		performanceTimeTotalminute = 150;
		
		
		//시간 수식
		int hh = performanceTimeTotalminute/60;
		int mm = performanceTimeTotalminute%60;
		
		
		//결과 출력
		System.out.println("\n** " + musicaiTitle + " 뮤지컬 관람 정보 **");
		System.out.println("공연 관람자 : " + musicalAudience);
		System.out.println("공연 관람일 : " + musicalViewDate);
		System.out.println("공연 시  간 : " +hh+ "시간 "+mm+"분");
		

	}

}
