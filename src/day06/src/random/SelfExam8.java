package random;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SelfExam8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,##0원");

        String[] beverages = {"커피", "라떼", "콜라", "녹차"};
        int[] prices = {4500, 5500, 1500, 3500};

        System.out.println("주문할 음료를 선택하세요>> \n[1. 커피, 2. 라떼, 3. 콜라, 4. 녹차]");
        int beverInt = scan.nextInt();

        System.out.println("주문 수량을 입력하세요.");
        int orderCnt = scan.nextInt();

        if (beverInt >= 1 && beverInt <= beverages.length) {
            int totalPrice = orderCnt * prices[beverInt - 1];
            String resultString = "주문한 음료 : " + beverages[beverInt - 1] + "\n" +
                                  "주문 수량 : " + orderCnt + "\n" +
                                  "결제 금액 : " + format.format(totalPrice);

            System.out.println(resultString);
        } else {
            System.out.println("잘못된 음료 번호입니다.");
        }
    }
}