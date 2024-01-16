package loop;

public class ForExam1 {
		
	public static void main(String[] args) {
	
		System.out.println("\n"+"q1----------------------------------------"+"\n");
		int sum1 =0;
		
		
		for (int i = 1; i <= 5; i++) {
			sum1 = sum1 + i;
			
		}
		System.out.println(sum1);
		
		
		
		
		System.out.println("\n"+"q2----------------------------------------"+"\n");
		int sum2 =0;
		
		
		for (int i = 1; i <= 100; i++) {
			sum2 = sum2 + i;
			
		}
		System.out.println("1 ~ 100까지의 자연수의 합 : " +sum2);
		
		
		System.out.println("\n"+"q3----------------------------------------"+"\n");
		int sum3 =0;
		
		
		for (int i = 100; i >= 1; i--) {
			sum3 = sum3 + i;
			
		}
		System.out.println("100 ~ 1까지의 자연수의 합 : " +sum3);
		
		
		System.out.println("\n"+"q4----------------------------------------"+"\n");
		int sum4 =0; //짝수의 합
		int sum5 =0; //홀수의 합
		int sum6 =0; //3의 배수의 합
		
		for (int i = 1; i <= 100; i++) {if (i%2==0) { sum4 = sum4 + i;
			
			} else { sum5 = sum5 + i;}
		}
		
		
		for (int i = 1; i <= 100; i++) {if (i%3==0) { sum6 = sum6 + i;
		
			}
		}
		
		System.out.println("1~100의 짝수의  합 : " +sum4);
		System.out.println("1~100의 홀수의  합 : " +sum5);
		System.out.println("1~100의 3의배수의  합 : " +sum6);
		
		
		
		System.out.println("\n"+"q5----------------------------------------"+"\n");
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println("3 * "+i+" = "+3*i);}
	}
}