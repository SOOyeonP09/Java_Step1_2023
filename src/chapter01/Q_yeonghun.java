package chapter01;

public class Q_yeonghun{
	public static void main(String[] args) {
		
		// Q1 
		
		byte aNum = 10;
		int bNum = aNum;     
		
		float cNum = 3.14f;
		double dNum = cNum;
		
        System.out.println("============1번째 문제=========");

		System.out.println("Byte : " +aNum);
		System.out.println("Int : " +bNum);
		System.out.println("Float : " +cNum);
		System.out.println("Double : " +dNum);
		
		// Q2
		
		float eNum = 1.2f;
		int fNum = (int)eNum;
		
		float  gNum = 2.5f;
		int hNum = (int)gNum;
		
        System.out.println("============2번째 문제=========");
		System.out.println("실수형 " + eNum + " 에서 정수형 " + fNum);
		System.out.println("실수형 " + gNum + " 에서 정수형 " + hNum);
		
		// Q3
		
        System.out.println("============3번째 문제=========");
        System.out.println("=== 3번째 문제 답 : 부동소수점 ===");


		// 부동소수점
		
		// Q4
		
		int i = 10;
        float j = 2.5f;
        
        System.out.println("============4번째 문제=========");
        System.out.println("Num1 : "+i +", Num2 : " + j);
        System.out.println("Add : " + (int)(i+j));
        System.out.println("Sub : " + (int)(i-j));
        System.out.println("Mul : " + (int)(i*j));
        System.out.println("Div : " + (int)(i/j));
        
        // Q5
        
        char a = '글';
        char b = '\uAE00';
        
        System.out.println("============5번째 문제=========");
        System.out.println(a);
        System.out.println(b+" 유니코드 AE00");
		
	}

}
