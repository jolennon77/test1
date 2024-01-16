package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class string {

	public static void main(java.lang.String[] args) {

		String str1 = new String("hello java");
		String str2 = "hello java";
		String str3 = "hello java";
		String str4 = new String("hello java");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str3); // true
		System.out.println(str2 == str4);
		System.out.println(str3 == str4);
		System.out.println("=================");
		System.out.println(str1.equals(str2)); // equels
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str4));
		System.out.println("=================");
		System.out.println(str1.length()); // length
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length());
		System.out.println("=================");
		System.out.println(str1.charAt(0)); // charAt
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));

		System.out.println("=================");
		System.out.println(str1.indexOf("l")); // indexof
		System.out.println(str1.lastIndexOf("l")); // lastindexof

		System.out.println("=================");
		System.out.println(String.valueOf(10)); // <-문자열 10 임

		System.out.println("=================");
		String h = "java";
		String j = "hello";
		String r = h.concat(j); // ==> javahello 두개문자열 결합 전화 번호 결합때 사용함
		System.out.println(r);
		System.out.println("=================");
		System.out.println("hello JAVA".toLowerCase()); // <-모두 소문자
		System.out.println("hello JAVA".toUpperCase()); // <-모두 소문자
		System.out.println("=================");
		System.out.println("Hello Java".replace("ava", "**")); // 문자열 특정부분 변경
		System.out.println("Hello Java".substring(0,5)); // 문자열 특정부분 뽑기 
		System.out.println("Hello Java".substring(1,7)); // 
		System.out.println("Hello Java".substring(0,10)); // (0,마지막인덱스+1) 전부 추출
		System.out.println("=================");
		String str = "Hello/Java-21/";
		String[] splitStr = str.split("/");
		System.out.println(Arrays.toString(splitStr));
		System.out.println("=================");
		String str9 = "	ab	cd	ef	";		//	좌우(앞뒤) 공백 제거
		System.out.println(str9.trim());
		
		
		
		
	}
}
