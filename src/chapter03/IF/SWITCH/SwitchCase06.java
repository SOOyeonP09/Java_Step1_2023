package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase06 {

	public static void main(String[] args) {

		int time=(int)(Math.random() * 10) + 9;
		Scanner scan = new Scanner(System.in);		
		
		switch (time) {
		case 9: // case 9 , 10 -> 14버젼 이후
			break;
		default:
			System.out.println("운동");
			break;
		}
		
	}
}