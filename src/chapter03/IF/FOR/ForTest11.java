package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest11 {

	public static void main(String[] args) {

//		System.out.println("단을 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// main
}// class
