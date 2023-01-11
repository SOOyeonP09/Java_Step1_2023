package chapter04;

public class ArrayCopy02 {


	public static void main(String[] args) {
		//Book bookArray1 배열 3개 선언
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		System.out.println("----------원본----------");
		bookArray1[0] = new Book("데미안", "헤르만 헤세");
		bookArray1[1] = new Book("빨간머리앤", "몽고메리");
		bookArray1[2] = new Book("백설공주", "그림형제");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		System.out.println("----------복사본----------");
		for(int i=0; i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		System.out.println("------------------------");

		
												// 깊은 복사라는 것은 다른 메모리를 참조하고 있는 것
		bookArray1[0].setBookname("제목초기화"); // 얕은복사 -> 같은 메모리를 참조하고 있는 것이다. 
		bookArray1[0].setAuthor("작가 초기화");

		bookArray1[0].showBookinfo();		
		bookArray2[0].showBookinfo();		

		
		
		
	}
}
