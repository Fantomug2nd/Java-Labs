package lab_1;

public class Main {

	public static void main(String[] args) {
		Matrix model = new Matrix();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.execute();
		controller.sortMatrix();
		controller.updateView();
	}
}
