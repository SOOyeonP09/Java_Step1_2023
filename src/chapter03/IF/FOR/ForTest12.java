package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}// main
}// class
