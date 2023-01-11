package chapter06;

import java.util.Scanner;

public class Vending {

	// 멤버변수
	private Can can[] = new Can[5];// 선언만 했다
	private int money;

	// 메소드

	public void init() {
		can[0] = new Can("환타", 1000);
		can[1] = new Can("콜라", 2000);
		can[2] = new Can("사이다", 3000);
		can[3] = new Can("참이슬", 4000);
		can[4] = new Can("진로", 5000);
	}

	// 사용 가능한 음료만 보여주기
	public void showCans(int m) {

		money = m;// 돈

		for (int i = 0; i < can.length; i++) {
			// 내가 가지고 있는 돈과 가격과 비교 판단

			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");

			} // if
		} // for
	}// method
	
	// 선택한 음료수 제공과 잔액
	public void outCan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을 선택하셨습니다.");
				System.out.println("잔 액 : " + (money - can[i].getPrice()) + "원");
			}
		}
	}
}
