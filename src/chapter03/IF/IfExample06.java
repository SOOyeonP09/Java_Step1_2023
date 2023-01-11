package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample06 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6 + 1);

		if (num == 1) {
			System.out.println("1점 -> 순대");
		}
		if (num == 2) {
			System.out.println("2점 -> 떡볶이");
		}
		if (num == 3) {
			System.out.println("3점 -> 튀김");
		}
		if (num == 4) {
			System.out.println("4점 -> 오뎅");
		}
		if (num == 5) {
			System.out.println("5점 -> 토스트");
		}
		if (num == 6) {
			System.out.println("6점 -> 꽝");
		}
	}
}
