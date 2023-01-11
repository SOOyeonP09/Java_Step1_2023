package chapter02;

public class AssingTest01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 2;
		
		num1 += num2;
		
		System.out.println(num1);
		
		int hap = Math.addExact(num1, num2);
		int mul = Math.multiplyExact(num1, num2);
		
		
		System.out.println(hap);
	}
}
