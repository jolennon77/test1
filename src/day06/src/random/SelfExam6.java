package random;

import java.text.DecimalFormat;
import java.util.Scanner;


public class SelfExam6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		DecimalFormat format = new DecimalFormat("#,##0원");
		
		int beverInt = 0;
		int orderCnt = 0;
		int totalPrice = 0;
		String resultString ="";
		String resultString1 ="";
		
		System.out.println("주문할 음료를 선택하세요>> \\n[1. 커피, 2. 라떼, 3. 콜라, 4. 녹차]");
		beverInt = scan.nextInt();
		
		System.out.println("주문 수량을 입력 하세요.");
		orderCnt = scan.nextInt();
		
//		if (beverInt == 1) { totalPrice = orderCnt * 4500;
//			
//		} else { if (beverInt == 2) { totalPrice = orderCnt * 5500;
//			
//		} else { if (beverInt == 3) { totalPrice = orderCnt * 1500;
//			
//		} else { if (beverInt == 1) { totalPrice = orderCnt * 3500;

	if (beverInt == 1) { totalPrice = orderCnt * 4500;
		
	} else { if (beverInt == 2) { totalPrice = orderCnt * 5500;
		
	} else { if (beverInt == 3) { totalPrice = orderCnt * 1500;
		
	} else { if (beverInt == 4) { totalPrice = orderCnt * 3500;
	}

	}

	}

	}
	
	if (beverInt == 1) { resultString = "주문한 음료 : 커피"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
	
	} else { if (beverInt == 2) { resultString = "주문한 음료 : 라떼"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
		
	} else { if (beverInt == 3) { resultString = "주문한 음료 : 콜라"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
		
	} else { if (beverInt == 4) { resultString = "주문한 음료 : 녹차"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
	}

	}

	}

	}
	
	System.out.println(resultString);
	
	
	switch (beverInt) {
	case 1: resultString1 = "주문한 음료 : 커피"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
		
		break;

	case 2: resultString1 = "주문한 음료 : 라떼"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
	
	break;
	
	case 3: resultString1 = "주문한 음료 : 콜라"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
	
	break;
	
	case 4: resultString1 = "주문한 음료 : 녹차"+"\n"+"주문 수량 : " + orderCnt+"\n"+"결제 금액 : " +format.format(totalPrice);
	
	break;
	
	default:
		break;
	}
	
	System.out.println(resultString1);
	}
}