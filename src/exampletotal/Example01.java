package exampletotal;

//import java.util.random;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example01 {

	public static void main(String[] args) {
		
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("==== 이번 주 로또 예상번호 ====");
		number = Integer.parseInt(JOptionPane.showInputDialog("입력할 번호를 입력하세요."));
		
		while(number>cnt) {
			
			/*
			outer : for(int i =0; i<lotto.length;i++) // i++생략가능
			{ lotto[i] = new Random().nextInt(45)+1;
			
			for (int j=0; j<i;j++){
				if(lotto[i] == lotto[j]){
					continue outer;
				}
				i++;
			}
		}; */
			
			
			System.out.printf("[%d] : ", cnt+1);
			for(int i =0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*40+6);
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						continue;
					}
				}
				System.out.printf(" %d ", lotto[i]);
			}
			System.out.println();
			cnt++;
		}
	}
}
