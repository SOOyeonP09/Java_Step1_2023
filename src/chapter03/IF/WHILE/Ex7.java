package chapter03.IF.WHILE;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		int scores[] = {98,92,97};
		
		int sum=0;
		double avg;
		
		for (int score : scores) {
			sum += score; 
		}
		
		avg = (double) sum / scores.length;
		
		System.out.printf("토탈 점수는 : %d 이고 평균은 : %2.1f 입니다.",sum,avg);
	}
}
