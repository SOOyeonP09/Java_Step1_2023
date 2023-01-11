package chapter01;

public class LongVariable {

	private static final char[] type = null;

	public static void main(String[] args) {
	
		//int num=12345678900; // 32bit = 4Byte
		long num2=12345678900L; 
		// Long을 사용할때는 경우에 따라 끝에 L을 붙여라
		long num3=1000; 
		// long형의 64비트이지만 L로 선언을 안해으므로 int로 인식
		
		int level; // 선언만하고 초기화되지 않음 
		level=10; // 리터널값
		
		System.out.println(num2+num3);
		
		
	}
}
