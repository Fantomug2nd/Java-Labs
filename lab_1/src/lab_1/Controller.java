package lab_1;

public class Controller {
	private Matrix model;
	private View view;
	
	public Controller( Matrix model, View view) {
		this.model = model;
		this.view = view;
	}
			
	public void sortMatrix() {
		model.sort();
	}
	public void execute() {
		view.printName();
		getNFromView();
		getMFromView();
		view.printMatrix(model.getA());
	}
	
	public void updateView() {
		view.printMatrix(model.getA());
	}
	
	private void getNFromView() {
		int N;
		N = view.getN();
		model.setN(N);
	}
	
	private void getMFromView() {
		int m;
		m = view.getM();
		model.setM(m);
	}
	
}
