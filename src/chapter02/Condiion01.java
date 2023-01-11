package chapter02;

public class Condiion01 {

	public static void main(String[] args) {
		
		int a=10, b=15;
		
		boolean result;
		
		result = ++a >= b ? true : false;
		
		System.out.println(result);
		
		a -= 1;
		b += 5;
		
		char result2;
		
		result2 = (++a == b) ? 'y' : 'n';
		
		System.out.println(result2);
	}
}
