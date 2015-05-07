package OOP1;

public class Author {
	
	private String first;
	private String second;
	private String middle;
	
	public Author(){
		first = "";
		second = "";
		middle = "";
	}
	
	public String getFirst(){
		return this.first;
	}
	public void setFirst(String First){
		this.first = First;
	}
	
	public String getSecond(){
		return this.second;
	}
	public void setSecond(String Second){
		this.second = Second;
	}
	public String getMiddle(){
		return this.middle;
	}
	public void setMiddle(String Middle){
		this.middle = Middle;
	}
	
}

