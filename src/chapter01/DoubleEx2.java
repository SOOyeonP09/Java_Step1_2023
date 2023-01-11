package chapter01;

public class DoubleEx2 {

	public static void main(String[] args) {
		// int float = 4byte 연산시에ㅡㄴ 더 정밀한 수로 자동 형변환이됨
		
		int aVal=10;
		float bVal=10.5f;
		
		int sVal=aVal+(int)bVal;
		float sVal1=(float)aVal+bVal;
		
		System.out.println((aVal+bVal)); //묵시적 형변환 float 
		System.out.println((sVal)); // float
		System.out.println((sVal1)); // float
		
	}
}
