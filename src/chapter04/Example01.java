package chapter04;

public class Example01 {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
//		double avg;
//		
//		for (int i = 0; i < array.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//			}
//			avg = (double) sum / array[i].length;
//			System.out.printf("총점 = %d, 평균 = %2.1f", sum, avg);
//			System.out.println();
//		}
		
//		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
//		double avg;
//		int total=0, cnt=0;
//		
//		for (int i = 0; i < array.length; i++) {
//			int sum = 0;
//			for (int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				cnt++;
//			}
//			total += sum;
//			avg = (double) sum / array[i].length;
//			System.out.printf("총점 = %d, 평균 = %2.1f", sum, avg);
//			System.out.println();
//		}
//		System.out.printf("모든 점수의 합 : %d\n",total);
//		System.out.printf("모든 점수의 평균  : %2.1f",(double)total/cnt);

		
		
		// 방법 3
		int total=0;
		for (int[] num : array) {
			total=0;
			for(int score : num) {
				total+=score;
			}
			System.out.println(total);
		}
	}
}
