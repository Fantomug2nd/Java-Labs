package lab_5;

public class Controller {
	private Model model;
	private View view;
	private FileManager fileManager;
	
	public Controller() {}
	public Controller(Model model, View view, FileManager fileManager) {
		this.model = model;
		this.view =view;
		this.fileManager = fileManager;
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
				readFromFileString();
				break;
			case 8:
				 readFromFileSerializableObjects();
				break;
			case 9:
				writeToFileString();
				break;
			case 10:
				writeToFileSerializableObjects();
				break;
			case 11:
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
			model.add(new Flat((int)(Math.random()*2000)+1,
							   (int)(Math.random()*2000)+1,
							   (int)(Math.random()*200)+1,
							   (int)(Math.random()*20)+1,
							   Type.COMMERCIAL,
							   (int)(Math.random()*100)+1));
		}
	}
		
	private void add(){
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
	
	private void readFromFileString() {
		model = new Model(fileManager.readFromFileString(view.getFilename()));
	}
	
	private void readFromFileSerializableObjects() {
		model = new Model(fileManager.readFromSerializableObjects(view.getFilename()));
	}
	
	private void writeToFileSerializableObjects() {
		fileManager.writeToFileSerializableObjects(model,view.getFilename());
	}
	
	private void writeToFileString() {
		fileManager.writeToFileString(model,view.getFilename());
	}
		
}
