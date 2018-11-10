package lab_3;

public class Flat {
	private int number;
	private int square;
	private int floor;
	private int rooms;
	private Type type;
	private int lifespan;
	
	public Flat(int number, int square, int floor, int rooms, Type type, int lifespan) {
		this.number = number;
		this.square = square;
		this.rooms = rooms;
		this.floor = floor;
		this.type = type;
		this.lifespan = lifespan;
	}
	
	public Flat(Flat other) {
		this(other.getNumber(), other.getSquare(), other.getFloor(),
			 other.getRooms(), other.getType(), other.getLifespan());
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	
	public int getSquare() {
		return square;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getFloor() {
		return floor;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public int getRooms() {
		return rooms;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	
	public int getLifespan() {
		return lifespan;
	}
	
	public String toString() {
		
		return	fixer(Integer.toString(number)) +
				fixer(Integer.toString(square)) +
				fixer(Integer.toString(floor)) +
				fixer(Integer.toString(rooms)) +
				fixer(type.toString()) +
				fixer(Integer.toString(lifespan)) +"|\n";
				
	}
	
	private String fixer(String string) {
		StringBuilder temp = new StringBuilder();
		temp.append("|  "+ string);
		for(int i = 0 ; i < (10 - string.length()); i++ ) 
			temp.append(' ');
		return temp.toString();
	}
	
}
