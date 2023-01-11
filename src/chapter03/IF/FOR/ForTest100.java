package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest100 {

	public static void main(String[] args) {

		int a, cnt3 = 0, cnt5 = 0;
		Scanner scan = new Scanner(System.in);
		String cn3 = "";
		String cn5 = "";
		System.out.println(" 정수를 입력하세요. ");

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 수 : ");
			a = scan.nextInt();
			if (a % 3 == 0) {
				cnt3++;
				cn3 += a + " "; // 문장으로 추가를 한다 

			} else if (a % 5 == 0) {
				cnt5++;
				cn5 += a + " ";
			}
		}

		System.out.println();
		System.out.println("입력하신 수 중 3의 배수는 " + cn3 + "이고 총 "+ cnt3 + " 개 입니다.");
		System.out.println("입력하신 수 중 5의 배수는 " + cn5 + "이고 총 "+ cnt5 + " 개 입니다.");

		System.out.println("프로그램이 종료합니다.");
	}
}
