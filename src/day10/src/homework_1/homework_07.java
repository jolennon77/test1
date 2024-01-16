package homework_1;


public class homework_07 {

	public static void main(String[] args) {
		//변수 설정
		int pencils = 357 ; //연필
		int students = 13;  //학생수
		int pencilsPerStudent = 0; //학생당 연필
		int restPencils = 0;		//남는 연필

		
		pencilsPerStudent = pencils /students;
		restPencils = pencils % students;
	
		System.out.print("1인당 연필 개수 : ");	System.out.println(pencilsPerStudent);
		System.out.print("남은 연필 개수 : ");	System.out.println(restPencils);
		
		
		
	}

}