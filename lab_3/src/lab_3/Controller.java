package lab_3;

public class Controller {
	private Model model;
	private View view;
	
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view =view;
	}
	
	public void menu() {
		loop: while(true) {
			int choice = view.menuChoice();
			switch(choice) {
			case 1:
				addCollection();
				break;
			case 2:
				add();
				break;
			case 3: 
				remove();
				break;
			case 4: 
				showAll();
				break;
			case 5: 
				filterByRooms();
				break;
			case 6:
				filterBySqAndFl();
				break;
			case 7:
				break loop;
			default: 
				 view.wrongChoice();
				 break;
			}
		}
	}
	
	private void filterByRooms() {
		Model temp = model.filterByRooms(view.setRooms());
		if (temp.getQuantity() > 0)
			view.printFlats(temp);
		else 
			view.noMatches();
	}
	
	private void filterBySqAndFl() {
		Model temp = model.filterBySqAndFl(view.setSquare(), view.setFloor());
		if (temp.getQuantity() > 0)
			view.printFlats(temp);
		else 
			view.noMatches();
	}
	
	private void showAll() {
		if(model.getQuantity() > 0)
			view.printFlats(model);
		else
			view.emptyTable();
	}
	
	private void addCollection() {
		for(int i = 0 ; i < 4; i++) {
			model.add(new Flat((int)(Math.random()*1000)+1,
							   (int)(Math.random()*1000000)+1,
							   (int)(Math.random()*100)+1,
							   (int)(Math.random()*10)+1,
							   Type.COMMERCIAL,
							   (int)(Math.random()*50)+1));
		}
	}
		
	private void add() {
		model.add(new Flat(view.setNumber(),
						   view.setSquare(),
						   view.setFloor(),
						   view.setRooms(),
						   view.setType(),
						   view.setLifespan()
				));
	}

	private void remove() {
		int pos = view.getPosition();
		if(pos < model.getQuantity())
			model.remove(pos);
		else 
			view.noSuchPosition(model.getQuantity());
	}
		
}
