package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// 전위연산
		
		System.out.println("==전위연산==");
		
		int gameScore=150;
		int lastScore1=++gameScore;
		System.out.println(lastScore1);
	
		int lastScore2=--gameScore;
		System.out.println(lastScore2);

		System.out.println("==후위연산==");
		int lastScore3=gameScore++; // 이미 넘기고 게임스코어를 더해준다.
		System.out.println(lastScore3);
		System.out.println(gameScore);
		
		System.out.println();

		int lastScore4=gameScore--; // 이미 넘기고 게임스코어를 더해준다.
		System.out.println(lastScore4);
		System.out.println(gameScore);
	
		
		
		
		
		
	
	
	}
}
