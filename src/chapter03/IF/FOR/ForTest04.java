package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {

		// ------- 문제 1, 정수를 입력받아 scanner 입력받은 정수부터 100까지의 합을 출력하시오.

//		Scanner scan = new Scanner(System.in);
//		int input, sum = 0;
//		System.out.print(" 숫자를 입력하세요. : ");
//
//		input = scan.nextInt();
//	
//		for (int i = input ; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(" 입력 받은 수 : " + input);
//		System.out.println(" "+input+" 부터 100까지의 합은 " + sum + " 입니다.");

		// -- 문제 2, 1부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
		// 단 입력받은 수가 0이면 무시

		Scanner scan = new Scanner(System.in);
		int input, num_cnt = 0;

		System.out.println(" 10개의 정수를 입력하세요. ");

		for (int i = 0; i < 10; i++) {
	
			System.out.print((i + 1) + " 번째 수를 입력하세요. : ");
			input = scan.nextInt();
			
			if (input == 0) {
				continue;
			}
			if (input % 2 == 0) {
				num_cnt++;
			}	
		}
		System.out.println(" 입력 받은 수들 중 짝수의 갯수 : " + num_cnt + " 개 ");
		
		
		
	}
}
