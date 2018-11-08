package lab_2;

import java.util.ArrayList;

public class Model {
	private String text ="Remain lively hardly needed at do by."
			+ " Two you fat downs fanny three. "
			+ "True mr gone most at. Dare as name just when with it body."
			+ " Travelling inquietude she increasing off impossible the.\t"
			+ " Cottage be noisier looking to we promise on.\n"
			+ "Disposal to kindness appetite diverted learning of on raptures. ";
	
	public String getText() {
		return text;
	}
	
	public ArrayList<String> splitting() {
		ArrayList<String> words = new ArrayList<String>();
		int min = 9999999;
		for(String word : text.split("[,|.| |\t|\n|;|]")) {
			if(word.length() > 0 && word.length() < min) {
				words.clear();
				min = word.length();
				words.add(word);
			}
			else if(word.length() == min) {
				words.add(word);
			}
		}
		return words;
	}
}
