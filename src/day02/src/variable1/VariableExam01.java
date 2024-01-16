package variable1;

public class VariableExam01 {

	public static void main(String[] args) {
		/*
		 * -----------------------------------
		 * 이름		국어	영어	수학
		 * -----------------------------------
		 * 홍길동	70		80		90
		 * -----------------------------------
		 */
		
		/*System.out.println("------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------");
		System.out.println("홍길동\t70\t80\t90");
		System.out.println("------------------");*/
		
		//타입(자료형,형) 변수명;
		//변수명 = 값;
		//타입 변수명 = 값;
		
		String name = "홍길동"; // 	변수선언 & 초기화
	    int kor = 70;
	    int eng = 90;
	    int mat = 85;
	    int sum = 0;
	    
	    
	    sum = kor + eng + mat;
	    
	    
	    	
	    
	    System.out.println("이름: " +name);
	    System.out.println("국어: " +kor);
	    System.out.println("영어: " +eng);
	    System.out.println("수학: " +mat);
	    System.out.println("총점: " +sum);
	    System.out.println("-------------");;
	    
	   
	    
	    
		
		
	}

}
