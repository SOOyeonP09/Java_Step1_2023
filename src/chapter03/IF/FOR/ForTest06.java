package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print(" 숫자를 입력하세요. : ");
		int a = scan.nextInt();

		if (a > 0 && a < 11) {
			for (int i = 1; i <= a; i++) {
				System.out.println("JAVA 프로그래밍 ! ");
			} // for
		} else {
			System.out.println(" 입력값이 잘못 되었습니다.");
		}//if
		System.out.println("프로그램이 종료됩니다. ! ");
	}// main
}// class
