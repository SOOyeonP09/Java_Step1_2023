package chapter04;

public class ArrayCopy3 {

	public static void main(String[] args) {

		Book[] bookArray = new Book[3];
		Book[] bookArray1 = new Book[3];

		bookArray[0] = new Book("데미안", "헤르만 헤세");
		bookArray[1] = new Book("빨간머리앤", "몽고메리");
		bookArray[2] = new Book("백설공주", "그림형제");

		bookArray1[0] = new Book();
		bookArray1[1] = new Book();
		bookArray1[2] = new Book();

		// 깊은 복사 문법이 없다.

		for (int i = 0; i < bookArray.length; i++) {
			bookArray1[i].setBookname(bookArray[i].getBookname());
			bookArray1[i].setAuthor(bookArray[i].getAuthor());
		}
		for (int i = 0; i < bookArray.length; i++) {
			bookArray1[i].showBookinfo();
		}
	}
}
