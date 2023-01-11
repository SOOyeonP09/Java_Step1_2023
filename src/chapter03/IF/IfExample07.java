package chapter03.IF;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {

		// Scanner 클래스 초기화 시키는 방법

		Scanner scan = new Scanner(System.in); // 객체,한번만 선언해주는 것

		System.out.print("1번째수 : ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("첫번째 입력받은 수 : " + num1);

		
		// num2 
		
		System.out.print("2번째 수 : ");
		double num2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("두 번째로 입력 받은 수 : " + num2);
		
		if (num2 != 0.0) {
			System.out.println("나눈 값 : " + num1/num2);
		}
	}
}
