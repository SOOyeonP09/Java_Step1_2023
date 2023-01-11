package chapter05;

public class TryCatchThrows {
	
	public static void fun() throws Exception {
		//try-catch는 예외문으로 이용 /간단한건 if문을 이용

		try {// 정상코드
			System.out.println("fun()메서드");
			throw new Exception();
		} catch (RuntimeException e) {// RuntimeException : 실행중에 발생하는 에러
			// Exception : 에러 시 수행하는 수행문
			System.out.println("예외발생");
		} finally {// 에러를 잡지 못해도 또는 에러를 잡아도 무조건 수행해야하는 코드
			System.out.println("fanally 문장");
		}

	}// fun

	public static void main(String[] args) {
		// static이므로 바로 호출가능해야하지만 throws Exception 메소드 이므로 안전장치로 try-catch를 불러(호출)야한다.
		// fun();

		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()의 catch문 문장");
		}

	}// main

}
