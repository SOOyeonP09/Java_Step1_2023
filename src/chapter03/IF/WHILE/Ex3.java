package chapter03.IF.WHILE;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {

		int f=0,a[] = new int[5];
		int[] b,c,d,e=new int[10];
		
		b = new int[2];
		c = new int[3];
		d = new int[4];
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		System.out.println(d.length);
		System.out.println(f);
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			e[i]=scan.nextInt();
		}
		
		for (int i=0; i<10; i++) {
			System.out.print(e[i]+ " ");
		}
		
		
		
		
	}

}
