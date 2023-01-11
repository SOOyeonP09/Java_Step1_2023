package chapter02;

class Student{
	
	String name;
	int age, korean_score, math_score, english_score;
	
	Student(String name, int age, int kor_score, int mat_score, int eng_score){
		this.name = name;
		this.age = age;
		this.korean_score = kor_score;
		this.math_score = mat_score;
		this.english_score = eng_score;
	}
	
	public void printScore() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국어 : " + korean_score);
		System.out.println("수학 : " + math_score);
		System.out.println("영어 : " + english_score);
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", 18,100,90,80);
		
		student.printScore();
		
	}

}
