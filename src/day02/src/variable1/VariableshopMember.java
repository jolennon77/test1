

package variable1;

public class VariableshopMember {

	public static void main(String[] args) {

		String id = "choong01";
		String pass = "choong01";
		String accountName ="홍길동";
		String phoneNumber ="010-1234-1234";
		String eMail = "choong@c.com";
		
		
		
	
		System.out.println("* 회원가입 *");
		
		System.out.print("아 이 디 : ");
		System.out.println(id);
		
		System.out.print("비밀번호 : ");
		System.out.println(pass);
		
		System.out.print("회 원 명 : ");
		System.out.println(accountName);
		
		System.out.print("전화번호 : ");
		System.out.println(phoneNumber);
		
		System.out.print("이 메 일 : ");
		System.out.println(eMail);
		
			
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		
		int firstNum = 5, secondNum = 7;
		
		System.out.println("변경전 firstNum = " + firstNum);
		System.out.println("변경전 secondNum = " + secondNum);
				
		
		
		
		int temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
				
		
		System.out.println("변경후 firstNum = " + firstNum);
		System.out.println("변경후 secondNum = " + secondNum);
				
				
		
		
	}

}
