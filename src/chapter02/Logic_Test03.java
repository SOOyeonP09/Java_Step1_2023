package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {
		
		int num=10,i=2;
		
		boolean value=((i=i+2)>10) && ((num=num+2)<10);
		
		System.out.println(i);
		System.out.println(num);
		System.out.println(value);
		
		System.out.println("========================");
		
		value=((i=i+2)>10) || ((num=num+2)<10);
		
		System.out.println(i);
		System.out.println(num);
		System.out.println(value);
		
		
	}
}
