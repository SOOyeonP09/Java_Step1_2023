package chapter02;



public class Arith_Test {

	public static void main(String[] args) {
		// 총점 평균
		
		int mathScore=96;
		int engScore=87;
		
		int hap;
		float avg;
		
		hap = mathScore+engScore;
		avg = (float)hap/2;
		
		System.out.println("총합 : "+hap);
		System.out.println("평균 : "+avg);
	}
}
