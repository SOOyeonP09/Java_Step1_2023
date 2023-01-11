package chapter03.IF.WHILE;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		String str[] = {"홍길동", "김유신", "장", "이순신"};
		String res="";
		
		for(int i = 0; i<str.length;i++) {
			res += str[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null,"[영웅들] \n" + res);
	
	}
}
