package chapter01;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		// 캐스팅 문법(명시저 형변환) : 원래 int인데 char로 명시한 것
		int iNum=1000;
		byte bNum=(byte)iNum; // -128 ~ 127
		
		
		System.out.println(bNum); // 유실된 결과값(손실)
		
		double dNum1=1.2;
		float fNum1=0.9f;
		
		int iNum2 =(int)(dNum1+fNum1);
		int iNum3 =(int)dNum1+(int)fNum1;
		
		System.out.println(iNum2);
		System.out.println(iNum3);

	}
}
