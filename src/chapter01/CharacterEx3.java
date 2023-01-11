package chapter01;

public class CharacterEx3 {
	
	public static void main(String[] args) {
		
		int a = 65;  // 아스키코드는 영어로만 만들어진다. 1byte = 8bit
		// A = 65, B = 66, ~ Z = 90
		// a = 97 ~ z = 122
		System.out.println(a);
		System.out.println((char)a); //명시적 형변환(ASCII 코드)
	}
}
