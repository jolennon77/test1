package homework_1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.NestingKind;
import javax.naming.spi.DirStateFactory.Result;
import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class homework_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력");
		int num = sc.nextInt();

		if (num % 2 == 0 || num % 3 == 0) {
			num = num + 1000;

		} else {
			num = num + 5000;
		}

		System.out.println(num);
	}
}