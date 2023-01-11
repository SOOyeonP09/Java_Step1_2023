package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//합계 단위를 만들어놓는거을 메소드(함수)
	//접근 지정자 : public(전체적으로 제한없이 공용으로 사용할 수 있게한다.)/protected(상속에서 사용) : 페키지안에서만 사용가능/private(클래스 하나 내에서만 사용가능)
	//void : return 없음
	public static void sum(int num1, int num2) {// sum()이렇게 비어이는것을 메개변수라고함
		// int num1=3;
		// int num2=5;
		int total = num1 + num2;
		System.out.println(total);
	}

	//실행을 담당하는 메소드
	public static void main(String[] args) {
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));

		sum(a, b);

	}//main
	/*
		//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
		int num1=3;
		int num2=5;
		int total = num1 + num2;
		System.out.println(total);
		*/
}//class	
