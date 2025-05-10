package objects;

public class Book {
	int bookNumber;  //첵번호
	String bookTitle;  //책제목
	
	//생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//설정자 메서드(setter)
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public void setBookTitle(String bookNumber) {
		this.bookTitle = bookTitle;
		
		//접근자 메서드(getter)
		public int getBookNumber() {
			return bookNumber;
		}
		public int getBookTitle() {
			return bookTitle;
		}
		public int getBookAuthor() {
			return author;
		}
	
	//객체의 정보를 문자열로 출력
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	/*@Override
	public boolean equals(Object obj) {
		//instanceof - 클래스의 객체(인스턴스)인지 확인 사용
		if(obj instanceof Book) {
			Book book = (Book)obj; //강제 타입 변환
			if(this.bookNumber == book.bookNumber)
				return true;
		}*/
		
		return false;
	}
	
	
	
}
