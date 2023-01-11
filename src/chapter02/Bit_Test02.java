package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		
		int num = 0B00000101;
		int num1= 0B11111111;
		int num2= 0B00000001;
		
		System.out.println(num);
		
		System.out.println(num1<<87);
		
		System.out.println(num2<<900000000);
		
		int a = 5, b= 2, c= a>>b, c1 =a<<b;
		
		System.out.println(c);
		System.out.println(c1);
		
		
	}
}
