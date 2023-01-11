package chapter07;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person.name = "박수연");
		System.out.println(person.height = 180f);
		System.out.println(person.weight = 80F);

		System.out.println("------------------------------------------");
		Person person1 = new Person();
		System.out.println(person1.name = "박수연");
		System.out.println(person1.height = 180f);
		System.out.println(person1.weight = 75F);

		System.out.println("------------------------------------------");
		Person person2 = new Person("박수연", 170, 70);
		System.out.println(person2.name);
		System.out.println(person2.height);
		System.out.println(person2.weight);

	}

}
