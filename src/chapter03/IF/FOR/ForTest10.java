package chapter03.IF.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum=0, i;
		System.out.print("정수를 입력하세요.");
		int num = scan.nextInt();
		
		for(i=1; ; i++) {
			
			if(sum>num) {
				break;
			}
			sum+=i;
		}
		System.out.print(i-1);
	}// main
}// class
