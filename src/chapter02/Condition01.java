package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		
		
		int fatherAge=47;
		int motherAge=45;
		
		char ch;
		String ch1;
		
		
		ch1 = (fatherAge > motherAge) ? "연상" : "연하";
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		System.out.println(ch1);
		
		
	}
}
