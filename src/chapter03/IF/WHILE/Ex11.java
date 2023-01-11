package chapter03.IF.WHILE;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int JavaScore[][] = new int[2][3];
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < JavaScore.length; i++) {
			for (int j = 0; j < JavaScore[i].length; j++) {
				System.out.printf("[%d][%d] 배열의 점수 : ",i,j);		
				JavaScore[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < JavaScore.length; i++) {
			for (int j = 0; j < JavaScore[i].length; j++) {
				System.out.print(JavaScore[i][j] + " ");
			}
			System.out.println();
		}
//		int JavaScore[][][] = new int[2][3][4];
//		int n = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < JavaScore.length; i++) {
//			for (int j = 0; j < JavaScore[i].length; j++) {
//				for(int k =0; k< JavaScore[i][j].length; k++) {
//					System.out.printf("[%d][%d][%d] 배열의 점수 : ",i,j,k);		
//					JavaScore[i][j][k] = scan.nextInt();	
//				}
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < JavaScore.length; i++) {
//			for (int j = 0; j < JavaScore[i].length; j++) {
//				for(int k =0; k< JavaScore[i][j].length; k++) {
//					System.out.print(JavaScore[i][j][k] + " ");	
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
	}
}
