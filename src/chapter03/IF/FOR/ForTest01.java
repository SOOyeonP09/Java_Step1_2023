package chapter03.IF.FOR;

import java.io.InputStreamReader; // 입력
import java.io.IOError; // 입력 에러
import java.util.Arrays; // 배열 관련 라이브러리


public class ForTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계

//		int sum = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		System.out.println("============================");
		
		int sum=0;
		for (int j = 1; j <= 100; j++) {
			sum = sum + j;
		}
		System.out.println("1부터 100까지의 합 : " + sum + " 입니다.");

//		OutputStream
	}


}
