package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {
		char grade;
		int jumsu;
		String[] me = { "최우수", "우수", "보통", "미흡", "매우미흡" };
		String[] gr = { "A", "B", "C", "D", "F" };

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("JAVA 점수"));

		// 방법2
		int i;
		if (jumsu >= 90) 
			i = 0;
		else if (jumsu >= 80)
			i = 1;
		else if (jumsu >= 70)
			i = 2;
		else if (jumsu >= 60)
			i = 3;
		else
			i = 4;
		System.out.println("성적은 : " + gr[i] + ", " + me[i] + "학생입니다.");

	}
}
