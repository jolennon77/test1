package method;

public class MethodExam9 {

	
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	private static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	private static double plus(int a, int b) {
		return a*b;
	}
	
	private static int minus(int a, int b) {
		return a-b;
	}
	
	private static int mutiple(int a, int b) {
		return a*b;
	}
	
	private static int division(int a, int b) {
//		if(b==0) {
//		return 0;
//	}
//	}
		return 0;}
	
	public static void main(String[] args) {
		powerOn();
		
		int resultPlus = (int) plus(4,3);
		int resultMinus = minus(4,3);
		int resultmultiple = mutiple(4,3);
		int resultDivision = division(4,3);
//		if(resultDivision==0) {
//			System.out.println("0으로 나눌 수 없습니다");
//		} else {
//			System.out.println("5/2 = " +resultDivision);
//		}
//		
		System.out.println("4+3 =" + resultPlus);
		System.out.println("8-3 =" + resultMinus);
		System.out.println("3*5 =" + resultmultiple);
		System.out.println("5/2 =" + resultDivision);
		
		
		powerOff();
		
	}
	
	
}