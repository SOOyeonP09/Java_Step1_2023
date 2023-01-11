package chapter02;

public class Logic_Test02 {

	public static void main(String[] args) {
		
		int num1=10, num2 = 20;
	
		System.out.println("----and-----");
		boolean flag1=(num1>10)&&(num2>20);
		System.out.println(flag1);

		boolean flag2=(num1>10)&&(num2>0);
		System.out.println(flag1);
	
		boolean flag3=(num1>0)&&(num2>20);
		System.out.println(flag1);

		boolean flag4=(num1>1)&&(num2>0);
		System.out.println(flag1);

		System.out.println("----or-----");
		boolean flag5=(num1>10)||(num2>20);
		System.out.println(flag5);

		boolean flag6=(num1>10)||(num2>0);
		System.out.println(flag6);
	
		boolean flag7=(num1>0)||(num2>20);
		System.out.println(flag7);

		boolean flag8=(num1>1)||(num2>0);
		System.out.println(flag8);

		System.out.println("----not-----");
		boolean flag9=(num1>10)!=(num2>20);
		System.out.println(flag9);

		boolean flag10=(num1>10)!=(num2>0);
		System.out.println(flag10);
	
		boolean flag11=(num1>0)!=(num2>20);
		System.out.println(flag11);

		boolean flag12=(num1>1)!=(num2>0);
		System.out.println(flag12);
	
		
		
		
		
		
		
	}
}
