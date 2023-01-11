package chapter02;

public class Person {
	
	String name;
	int age;
	char sex;
	
	Person(String name, int age, char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	void eat() {
		System.out.println("e");
	}
	void walk() {
		System.out.println("w");
	}
	void sleep() {
		System.out.println("s");
	}
}
