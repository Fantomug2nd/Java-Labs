package lab_2;

import java.util.ArrayList;

public class Controller {
	private Model model;
	private View view;
	public Controller(Model model, View view) {
		this.model = model;
		this.view =view;
	}
	
	public void showText() {
		view.printText(model.getText());
	}
	
	public void showResult() {
		view.printResult(model.splitting());
	}
}
