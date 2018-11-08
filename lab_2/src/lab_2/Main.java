package lab_2;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller(new Model(), new View());
		controller.showText();
		controller.showResult();
	}
}
