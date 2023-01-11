package chapter05;

import java.util.Scanner;

public class Method {

	// 멤버변수(=필드)

	// 생성자 생략

	// 오버로딩 메소드

	void makeBread() {
		System.out.println("빵을 만듭니다.");

	}// method1

	void makeBread(int count) {
		// 1번째 빵을 만들었습니다.
		// 2번째 빵을 만들었습니다.
		// ...
		// 요청하신 5개의 빵이 모두 완료되었습니다
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었습니다");
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완료되었습니다.");

	}// method2

	void makeBread(int count, String n) {
		// 1번째 생크림 빵을 만들었습니다.
		// 2번째 생크림 빵을 만들었습니다.
		// ...
		// 요청하신 5개의 생크림 빵이 모두 완료되었습니다
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + n + "빵을 만들었습니다");
		}
		System.out.println("요청하신 " + count + "개의 " + n + "빵이 모두 완료되었습니다.");

	}// method3

	void order(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵이 모두 완료되었습니다.");

	}// order method1

	void order(int count, String m) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째 " + m + "빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 " + m + "빵이 모두 완료되었습니다.");

	}// order mehod2

	void order() {

		Method bread = new Method();

		while (true) {
			System.out.println("1. 빵 갯수 선택 | 2.빵의 갯수와 종류 | 3. 종료 : ");
			System.out.print("선택> ");
			Scanner scan = new Scanner(System.in);
			int j = scan.nextInt();

			if (j == 1) {
				System.out.print("주문할 빵의 갯수 : ");
				int s = scan.nextInt();
				bread.order(s);
				System.out.println();
				// break;
			}
			if (j == 2) {
				System.out.print("주문할 빵의 갯수 : ");
				int a = scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String b = scan.next();
				bread.order(a, b);
				System.out.println();
				// break;
			}
			if (j == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		} // while
	}// order Method3
}