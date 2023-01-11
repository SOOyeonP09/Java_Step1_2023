package chapter03.IF.WHILE;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
		char alpa[] = new char[26];
		char ch='A';
		
		
		for(int i=0; i<alpa.length; i++) {
			alpa[i] = ch++;
			System.out.print(alpa[i]);		
		}	
	}
}
