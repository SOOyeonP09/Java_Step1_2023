package chapter04;

public class Example22 {

	public static void main(String[] args) {

		String st2[] = new String[3], st1[] = new String[] { "1", "2", "3" };

		for (String st : st1) {
			System.out.println(st);
		}
		System.arraycopy(st1, 0, st2, 0, 3);

		for (String st : st2) {
			System.out.println(st);
		}

	}
}
