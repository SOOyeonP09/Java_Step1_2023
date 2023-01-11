package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print(" 정수를 입력하세요. : ");
		for (int i=0; i<10; i++) {
			a[i] = scan.nextInt();
		}
		
		
		for(int i =0; i<10; i++) {
			if (a[i] %3 == 0 ) {
				System.out.print("3의 배수는 ");
				System.out.print(a[i]);
				 // for
			} else if( a[i] %5==0 ) {
//				System.out.println("5의 배수입니다. ! "); // for
				System.out.print("5의 배수는 " + a[i]);
			} else {
//				System.out.println(" 3과 5의 배수가 아닙니다. ");
			}//if
		}
		System.out.println("프로그램이 종료됩니다. ! ");
	}// main
}// class
