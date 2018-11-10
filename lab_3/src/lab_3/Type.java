package lab_3;

public enum Type {
	EDUCANTIONAL,
	RESIDENTIAL,
	MEDICAL,
	COMMERCIAL;
	
	public String toString() {
		if(this.ordinal() ==0) 
			return ("E");
		if(this.ordinal() ==1) 
			return ("R");
		if(this.ordinal() ==2) 
			return ("M");
		return ("C");
	}
}
