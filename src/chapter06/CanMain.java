package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		String select = "";
		int money = 0;

		Vending ven = new Vending();
		ven.init();// 음료 준비

		System.out.print("돈을 투입하세요 : ");
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();// 돈투입
		ven.showCans(money);
		System.out.println("---------------------------------------");
		System.out.print("음료를 선택하세요 : ");
		Scanner s = new Scanner(System.in);
		select = s.next();// 음료선택
		ven.outCan(select);

	}

}
