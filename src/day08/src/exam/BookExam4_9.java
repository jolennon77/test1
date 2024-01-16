package exam;

import java.util.Scanner;



public class BookExam4_9 {
	

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("----------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n----------------------------------");
            System.out.print("선택> ");

            int menuSelectNum = scanner.nextInt();

            switch (menuSelectNum) {
                case 1:
                    System.out.print("예금액> ");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
