package chapter07;

public class OverloadMain {

	public static void main(String[] args) {

		Overload obj1 = new Overload();
		obj1.Disp();
		System.out.println();

		Overload obj2 = new Overload(22, 172.6f);
		obj1.Disp();
		System.out.println();

		Overload obj3 = new Overload(22, 172.6f, "이순신");
		obj1.Disp();
		System.out.println();

	}

}
