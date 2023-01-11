package chapter03.IF.SWITCH;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		
		int num, i;
		String[] arr = {"예금조회","출금","입금","송금","번호를 잘못 입력하셨습니다."};
		num = Integer.parseInt(JOptionPane.showInputDialog("1: 예금조회, 2: 출금, 3: 입금, 4: 송금"));
		
		switch (num) {
		case 1:
			i = 1;
			System.out.println("예금조회를 선택하셨습니다.");
			break;
		case 2:	
			i = 2;
			System.out.println("출금을 선택하셨습니다.");

			break;
		case 3:	
			i = 3;
			System.out.println("입금을 선택하셨습니다.");

			break;
		case 4:		
			i = 4;
			System.out.println("송금을 선택하셨습니다.");

			break;			
		default:
			i = 5;
			System.out.println("번호를 잘못 선택하셨습니다.");
			break;
		}
		System.out.println(arr[i-1] + " 를(을) 선택하셨습니다.");

	}
}
//
//JOptionPane.showMessageDialog(null, "번호를 잘못 선택하셨습니다.");
//JOptionPane.showMessageDialog(null, arr[i-1] + " 를(을) 선택하셨습니다.");
//JOptionPane.showMessageDialog(null, "송금을 선택하셨습니다.");
//JOptionPane.showMessageDialog(null, "입금을 선택하셨습니다.");
//JOptionPane.showMessageDialog(null, "출금을 선택하셨습니다.");
//JOptionPane.showMessageDialog(null, "번호를 잘못 선택하셨습니다.");
//
//JOptionPane.showMessageDialog(null, "예금조회를 선택하셨습니다.");


