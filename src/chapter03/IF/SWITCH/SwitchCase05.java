package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase05 {

	public static void main(String[] args) {

		// 주사위

		Scanner scan = new Scanner(System.in);
		System.out.print("주사위 눈의 수 : ");
		int num = (int) (Math.random() * 10) + 1;

		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: {
			System.out.println(num + " 점 획득");
			break;
		}
		default:
			System.out.println("잘못된 숫자 입니다.");
			break;
		}
	}
}