package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	
	/*
	 // 쌤 풀이
	// 멤버변수
	private int[] num = new int[3];
	private String result;

	Scanner scan = new Scanner(System.in);

	// 생성자
	public BaseballGame() {

		int[] numberPool = new int[9];
		outer: for (int i = 0; i < 3;) {// 증가값이 생략이 가능하다
			num[i] = new Random().nextInt(9) + 1;
			// 중복값을 제거하는 반복문
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					continue outer;
				}//if
			}//for
			i++;
		}//for
	}//BaseballGame
	
	
	public String check() {
		result = "OUT";
		int[]myNum=new int[3];
		int strike=0;
		int ball=0;
		
		System.out.println("1~9사이의 수를 입력하세요");
		String[] numStr = {"첫","두","세"};
		
	}
	
	*/
	
	
	
	
	public int com1;
	public int com2;
	public int com3;
	public int user1;
	public int user2;
	public int user3;
	public String check;
	
	public BaseballGame() {
		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {
			// 1~9사이의 난수(임의의 수)발생
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (com1 == com2 || com1 == com3 || com2 == com3);

		// 컴퓨터는 준비가 완료된 상태

		// 사용자가 입력할 수
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;

		while (true) {
			System.out.println("--1 ~ 9 사이의 수를 입력하시오--");
			System.out.println();
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = scan.nextInt();// 사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = scan.nextInt();// 사용자가 준비한 수
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = scan.nextInt();// 사용자가 준비한 수
			System.out.println();

			int strike = 0;
			int ball = 0;

			// 만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같을 확률

			if (user1 == com1) {// 만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같으면 strike//
				// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user1 == com2 || user1 == com3) {// 첫번째 (user1) 숫자가 com2 또는 com3랑 맞으면 ball
				// 자리는 틀리고 숫자만 맞을경우
				ball++;
			}

			// ----------------------------------------------------------

			if (user2 == com2) {// 만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같으면 strike//
				// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user2 == com1 || user2 == com3) {// 첫번째 (user1) 숫자가 com2 또는 com3랑 맞으면 ball
				// 자리는 틀리고 숫자만 맞을경우
				ball++;
			}

			// ----------------------------------------------------------

			if (user3 == com3) {// 만약에 com1과 사용자가 입력한 첫번째(user1) 숫자가 같으면 strike//
				// 숫자와 자리까지 모두 같을 경우
				strike++;
			} else if (user3 == com1 || user3 == com2) {// 첫번째 (user1) 숫자가 com2 또는 com3랑 맞으면 ball
				// 자리는 틀리고 숫자만 맞을경우
				ball++;
			}
			// ----------------------------------------------------------

			if (strike == 3) {
				System.out.println("WIN!! - " + com1 + com2 + com3);
				System.out.println();
				check="WIN";
				break;
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + " Strike, " + ball + " Ball");
					System.out.println();
				} else {// 아무것도 일치하는 것이 없을 경우
					System.out.println("OUT!!");
					System.out.println();
				}
			}

		} // while}
		return;
	}
	
}