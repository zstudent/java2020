package lesson210122;

import java.util.List;

public class Specialization {

}


class Window {
	int x, y;
	int w, h;
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class TextWindow extends Window { // special kind of widows
	int rows, columns;
	List<String> text;
	
	void setText(List<String> newText) {
		text = newText;
	}
}