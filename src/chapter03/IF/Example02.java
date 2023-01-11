package chapter03.IF;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {

		char gender;

		Scanner scan = new Scanner(System.in);

		System.out.print("성별을 입력하세요.(F/M) : ");
		gender = scan.nextLine().charAt(0);
		if (gender == 'F' || gender == 'f') {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}

		System.out.println("---------------------------");
		System.out.print("주문하시겠습니까?(Y,N) : ");

		char ch;
		String menu;

		ch = scan.nextLine().charAt(0);
		// 논리함수 사용

		if (ch == 'Y' || ch == 'y') {
			System.out.print("메뉴를 입력하세요 : ");
			menu = scan.nextLine();
			System.out.println(menu + "(가)이 주문 완료되었습니다.");

		} else {
			System.out.println("이용해주셔서 감사합니다.");
		}
	}
}
