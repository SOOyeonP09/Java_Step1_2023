package chapter06;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StartMain {

	public static void main(String[] args) {

		int select;
		String check;

		// 객체생성

		// 방법1
		Start st = new Start();

		while (true) {

			System.out.print("숫자를 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			check = st.check(select);

			if (check.equals("SUCCESS")) {
				break;
			}
		} // while
		
		/*
		//방법2
		Start obj = new Start();
		int num;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("숫자 입력 : ");
			num = s.nextInt();
		}while(obj.check(num).equals("FAIL"));
		*/
	}

}
