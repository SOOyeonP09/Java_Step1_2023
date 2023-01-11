package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest101 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("인원수: ");
		int cnt = scanner.nextInt();

		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "번째 성적: ");
			int score = scanner.nextInt();
			sum += score;
		}

		double average = (double) sum / cnt;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
	}

}
