package chapter03.IF;

class clsA{
	void fun() {
		System.out.println("2023년 1월 첫 주 월요일 입니다.");
	}
}
class clsB extends clsA {
	
}
public class ClassStudy01 {

	public static void main(String[] args) {
		
		clsB objB=new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("YES");
			objB.fun();
		}
		
		if(objB instanceof clsB) { // 포함되어 있냐
			System.out.println("YES");
		}
		
	}
}
