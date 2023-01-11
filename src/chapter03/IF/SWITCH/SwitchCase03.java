package chapter03.IF.SWITCH;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class SwitchCase03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int month, day;

		System.out.print("월을 입력하세요. (1 ~ 12) :");
		month = scan.nextInt();

		switch (month) {
		case 1:
			day = 31;
			break;
		case 2:
			day = 25;
			break;

		default:
			break;
		}

	}
}
