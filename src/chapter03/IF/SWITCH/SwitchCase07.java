package chapter03.IF.SWITCH;

import java.util.Scanner;

public class SwitchCase07 {

	public static void main(String[] args) {

		// 오전 9 ~ 오후 6
		int time=(int)(Math.random() * 10) + 9;
		Scanner scan = new Scanner(System.in);
		System.out.print("[ 현재시간 : "+time+"시 ]");
		System.out.print(" 할 일 : ");
		switch (time) {
		case 9:
			System.out.println("수업듣기");
			break;
		case 10:
			System.out.println("복습");
			break;
		case 11:
			System.out.println("");
			break;
		case 12:
			System.out.println("점심");
			break;
		case 13:
			System.out.println("낮잠");
			break;
		case 14:
			System.out.println("공부");
			break;
		case 15:
			System.out.println("공부");
			break;
		case 16:
			System.out.println("간식");
			break;
		case 17:
			System.out.println("공부");
			break;
		case 18:
			System.out.println("저녁");
			break;

		default:
			System.out.println("운동");
			break;
		}
		
	}
}