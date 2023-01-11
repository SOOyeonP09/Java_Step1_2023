package chapter03.IF.SWITCH;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class SwitchCase04 {

	public static void main(String[] args) {

		// 스캔 클래스로 인스턴스 변수 scan에 값을 입력받음
		// A, a -> 우수고객 / B, b -> 일반 회원 / 나머지 고객
		Scanner scan = new Scanner(System.in);
		
		String grade_u;
		char grade;
		String s;
		//charAt(0) : String -> char로 바꿔주는것 
		System.out.print("등급을 입력하세요. (A,B,C) : ");
		
//		grade=scan.nextLine().charAt(0);
		grade_u = scan.nextLine();
//		grade = grade_u.toUpperCase();
		
		// switch
		
//		switch (grade) {
////		case 'A': case 97:
//		case 'A':
//			s = "우수고객";
//			break;
//		case 'B':
//
////		case 'B': case 98:
//			s = "일반회원";
//			break;
//		default:
//			s = "고객";
//			break;
//		}
//		System.out.println(s +"입니다.");
		
		
	}
}
