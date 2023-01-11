package chapter04;

public class Book {

	public String bookname, author; // 멤버변수, get

	// 디폴트 생성자 = 때문에 출력이 나오는 것이다.
	public Book() {

	}

	// 오버로딩이 되는 것이다.
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
		showBookinfo();
	}

	// ==========================================
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

//	private 
	// 사용자 정의
	void showBookinfo() {
		System.out.printf("책이름 : %s, 저자 : %s\n",bookname,author);
	}

}
