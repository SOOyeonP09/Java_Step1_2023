package chapter03.IF.WHILE;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, input_money;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int input_num = scan.nextInt();
			
			if (input_num == 4) {
				System.out.print("프로그램을 종료하시겠습니까? (1: 예, 2: 아니요) ");
				int put = scan.nextInt();
				if (put == 1) {
					System.out.println("프로그램 종료");
					run = false;
				}
			}
			switch (input_num) {
			case 1:
				System.out.print("예금액> ");
				input_money = scan.nextInt();
				if (input_money < 0) {
					System.out.println("잘못된 금액입니다.");
					break;
				}
				balance += input_money;
				break;
			case 2:
				System.out.print("출금액> ");
				input_money = scan.nextInt();
				if (balance >= input_money) {
					balance -= input_money;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3:
				System.out.print("잔액> ");
				System.out.println(balance);
				break;
			case 4:
//				run = false;
//				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}
		}
	}
}
