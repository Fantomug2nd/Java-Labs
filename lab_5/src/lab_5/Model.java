package lab_5;

public class Model {
	private Flat []flats;
	private int quantity;
	
	public Model() {
		flats = new Flat[100000];
		quantity = 0;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void add(Flat flat) {
		flats[quantity] = new Flat(flat);

		quantity++;
	}
	
	public void remove(int pos) {
		for(int i = pos; i <quantity-1; i++) {
			flats[i] = flats[i+1];
		}
		flats[quantity-1] = null;
		quantity--;
	}
	
	public Model filterByRooms(int rooms) {
		Model temp = new Model();
		for(int i = 0; i < quantity;  i++) {
			if(flats[i].getRooms() == rooms)
				temp.add(flats[i]);
		}
		return temp;
	}

	public Model filterBySqAndFl(int square, int floor) {
		Model temp = new Model();
		for(int i = 0; i < quantity;  i++) {
			if(flats[i].getSquare() > square && flats[i].getFloor() > floor)
				temp.add(flats[i]);
		}
		return temp;
	}
	public String toString() {
		StringBuilder temp = new StringBuilder();
		for(int i=0; i < quantity; i++) {
			temp.append(flats[i].toString());
		}
		return temp.toString();
	}
}
