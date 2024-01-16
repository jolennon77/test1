package variable.exam1;

public class VariableUseExample {

	public static void main(String[] args) {

		int hour = 3;
		int min = 5;
		
		int totalMin = hour * 60 + min;
		
		System.out.println(totalMin);
		
		System.out.printf("%d%s %d%s", hour,"시",min,"분");
				
		
	}

}
