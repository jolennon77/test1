package method;

public class MethodExam01_copy {
				// ↓ 보이드 :다른 메소드로 넘겨주는값없다는 뜻
	public static void main(String[] args) {
		// # 1. 1~5까지의 합
		System.out.println(sumCall(1, 5));
						//sumCall()메소드를 호출한다
						//여기서 ()의 내용 (1,5) - >매개값, 매개변수,인자 라고 말함
		System.out.println(sumCall(1, 10));
		System.out.println(sumCall(50, 100));
		System.out.println(sumCall(35, 75));
		showInfo();
		
		printShow(100);
	}
				// ↓ 여기서 인트는 리턴할 값의 타입을 알려줌
	public static int sumCall(int start, int end) { // 메소드() <- 가로 안에값으로 메소드를 호출한다
													// start ,end 같은 변수를 매개변수파라미터라고 한다
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum; // return 값= 메소드의 값을 리턴 한다는 뜻

	}
	
	public static void showInfo() {
	System.out.println("여기는 리턴값이 없는 것을 연습합니다");	
	}

	public static void printShow(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			sum +=i;
		}
	System.out.println("1 ~ "+ num+"까지의 합 : "+sum);
		
	}
	
}
