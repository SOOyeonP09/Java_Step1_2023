package chapter01;

public class DoubleEx1 {

	public static void main(String[] args) {
		
		// Number : 1bit -> byte -> short -> int -> long(L)
		// 문자 표현 : char('') -> String("")
		// 소수 : float(f) -> double
		// 형변환
		
//		String str = "ABC"; // String
//		int i = 123; // Integer
//		
//		System.out.println(str.getClass().getName());
//		System.out.println(i.getClass().getName());
		
		float fnum= 3.14f;  // 4byte; 뒤에 f를 붙여야한다. 
		double dnum=3.14; // 8byte;
		
		int aNum=3;
		
		
		
		System.out.println((float)aNum);
	}
}
