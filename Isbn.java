package OOP1;

public class Isbn {
	
	private int prefix;
	private int group;
	private int publicationElement;
	private int registrationElement;
	private int checkDigit;
	
	public Isbn(){
		
		prefix = 0;
		group = 0;
		publicationElement= 0;
		registrationElement=0;
		checkDigit=0;
	}
	
	public int getPrefix(){
		return this.prefix;
	}
	public void setPrefix(int Prefix){
		this.prefix = Prefix;
	}
	
	public int getGroup(){
		return this.group;
	}
	
	public void setGroup(int Group){
		this.group = Group;
	}
	
	public int getPublicationElement(){
		return this.publicationElement;
	}

	public void setPublicationElement(int PublicationElement){
		this.publicationElement = PublicationElement;
	}
	public int getRegistrationElement(){
		return this.registrationElement;
	}
	public void setRegistrationElement(int RegistrationElement){
		this.registrationElement = RegistrationElement;
	}
	public int getCheckDigit(){
		return this.checkDigit;
	}
	public void setCheckDigit(int CheckDigit){
		this.checkDigit = CheckDigit;
	}
}
