package chapter04;

import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {
		
		// -- 학생수를 입력받아, 점수 입력, 점수리스트, 분석, 종료하는 코드
		boolean run = true;
		int student = 0;
		int score[] = null;
		int max = 0, min = 0;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int input_num = scan.nextInt();

			if (input_num == 1) {
				System.out.print("학생수> ");
				student = scan.nextInt();
				score = new int[student];
				if (student < 0) {
					System.out.println("잘못된 학생 수입니다.");
				}
			} else if (score == null) {
				System.out.println("학생수를 입력하세요.");
			} else if (input_num == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.printf("score[%d] :", i + 1);
					score[i] = scan.nextInt();
				}
			} else if (input_num == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%d번째 학생 score[%d]\n", i + 1, score[i]);
				}
			} else if (input_num == 4) {
				int hap = 0;
				double avg = 0;
				for (int i = 0; i < score.length; i++) {
					hap += score[i];
					max = score[0];
					min = score[0];
					if (min > score[i]) {
						min = score[i];
					}
					if (max < score[i]) {
						max = score[i];
					}
				}
				avg = (double) hap / student;
				System.out.printf("최고 점수 : %d\n", max);
				System.out.printf("최저 점수 : %d\n", min);
				System.out.printf("총점 : %d\n", hap);
				System.out.printf("평균 : %2.1f\n", avg);
			} else if (input_num == 5) {
				run = false;
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		}
	}
}
