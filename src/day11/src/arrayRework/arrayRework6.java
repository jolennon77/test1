package arrayRework;

import java.util.Scanner;


public class arrayRework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
        // 1. 배열 생성
        String bever[] = {"커피", "라떼", "콜라", "녹차"};
        int beverNum[] = {1, 2, 3, 4};
        int beverPrice[] = {3500, 5500, 1500, 3500};
        String orderList = "";
        int totalPrice = 0;

        // 2. 음료 선택 질문
        while (true) {
            System.out.println("주문할 음료를 선택하세요>> \n[1. 커피, 2. 라떼, 3. 콜라, 4. 녹차]");
            int customerSelect = sc.nextInt();
            System.out.println("주문 수량을 입력하세요");
            int orderCnt = sc.nextInt();

            for (int i = 0; i < beverPrice.length; i++) {
                if (customerSelect == beverNum[i]) {
                    orderList += bever[i] + " ";
                    totalPrice += beverPrice[i] * orderCnt;
                    break;
                }//end of if 1
            }//end of for

            System.out.println("계속 주문하겠습니까? y or n");
            String answerString = sc.next();

            if (answerString.equalsIgnoreCase("n")) {
                break;
            }//end of if2
        }//end of while

        System.out.println("주문한 음료 : " + orderList);
        System.out.println("결제 금액 : " + totalPrice);

    }
}