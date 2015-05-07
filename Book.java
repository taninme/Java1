package OOP1;

public class Book {
	private String title;
	private String author;
	private int year;
	private String isbn;
	
	public Book(){
		title = "";
		author = "";
		year = 0;
		isbn = "";
	}
	
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title1){
		this.title = title1;
	}
	
	public String getAuthor(){
		return this.author;
	}
	public void setAuthor(String author1){
	   this.author = author1;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year1){
		this.year = year1;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public void setIsbn(String isbn1){
		this.isbn = isbn1;
	}
	
	public String Book1() {
		String test = Integer.toString(year);
		return '"'+title+'"'+","+author+" "+"("+test+")"+" "+"ISBN: " +isbn.substring(0,3)+"-"+isbn.substring(4); 
	}


	public static void main(String[] args){
		
	Book book1 = new Book();
	book1.setTitle("The Unbearable Lightness of Being");
	book1.setAuthor("Milan Kundera");
	book1.setYear(1984);
	book1.setIsbn("9780061148521");
	System.out.println(book1.Book1());
	
}
}
