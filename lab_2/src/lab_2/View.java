package lab_2;

import java.util.ArrayList;

public class View {

	public void printText(String text) {
		System.out.println("Our text:");
		System.out.println(text+'\n');
		
	}
	
	public void printResult(ArrayList<String> words) {
		System.out.println("Minimum word size: " + words.get(0).length());
		System.out.print("Our words: ");
		for(String word : words) {
			System.out.print(word + " ");
		}
	}

}
