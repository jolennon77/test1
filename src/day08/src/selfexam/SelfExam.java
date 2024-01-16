 
package selfexam;

import java.util.Scanner;

public class SelfExam{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("주민등록번호를 입력하세요 (예시: 990108-1******): ");
        String jumin = scanner.nextLine();

        char genderCheck = jumin.charAt(7);

        // 8번째 자리에 따라 성별 결정
        if (genderCheck == '1' || genderCheck == '3') {
            System.out.println("성별: 남");
        } else if (genderCheck == '2' || genderCheck == '4') {
            System.out.println("성별: 여");
        } else {
            System.out.println("올바른 주민등록번호 형식이 아닙니다.");
        }
    }
}