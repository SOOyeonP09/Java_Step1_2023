package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading fun = new FunTest_Overloading();
		// fun이라는 지정한 변수를 객체라고 한다.

		fun.getResult(1);
		fun.getResult('A');
		fun.getResult("해피");
		fun.getResult(6, "2023");

	}

}
