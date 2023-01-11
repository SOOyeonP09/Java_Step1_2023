package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {

		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수를 입력하세요."));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 수를 입력하세요."));
		
		
		System.out.println("입력 받은 수는 : " + num1 +  " , " + num2 + "입니다.");
	
		if (num1 > num2) {
			System.out.println("num1이 큽니다.");
		} else if (num1 < num2) {
			System.out.println("num2가 큽니다.");
		} else {
			System.out.println("두 수는 같습니다..");
		}
	}
}
