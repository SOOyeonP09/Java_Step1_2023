package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		
		int num1 = 2;  // 0010
		int num2 = 10; // 1010
		
		//Bit OR(|)
		int result = num1 | num2;
		System.out.println(result);

		//Bit AND(&)
		int result1 = num1 & num2;
		System.out.println(result1);

		//Bit XOR(^)
		int result2 = num1 ^ num2;
		System.out.println(result2);

		//Bit ~(~)
		int result3 = ~(num1); 
		System.out.println(result3);
		
		//Bit ~(~)
		int result4 = ~(num2); 
		System.out.println(result4);
		
		// shift ( < )
		int result5 = (num1<<1); 
		System.out.println(result5);
		
		int result6 = (num2<<1); 
		System.out.println(result6);
		
		
	}
}
