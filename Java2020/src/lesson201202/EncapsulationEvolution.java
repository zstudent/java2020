package lesson201202;

public class EncapsulationEvolution {
	
	public static void main(String[] args) {

		Point p = PointOperations.createPoint(10,  10);
		PointOperations.move(p, -1, -1);
		
		NewPoint np = new NewPoint(20, 20);
//		np.move(1, 0);
//		np.x = 10;    PROHIBITED!  no direct access to private members!
		np.placetoY();
	}

}


class PointOperations {
	
	static Point createPoint(int x, int y) {
		Point p = new Point();
		p.x = x;
		p.y = y;
		return p;
	}
	
	static void move(Point p, int xShift, int yShift) {
		p.x += xShift;
		p.y += yShift;
	}
	
}

class Point {  // struct
	int x;
	int y;
}

class NewPoint {
	
	int x;
	int y;

	public NewPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void move(int xShift, int yShift) {
		this.x += xShift;
		this.y += yShift;
	}
	
	public void center() {
//		x = 0;
//		y = 0;
		move(0,0);
	}
	
	public void placetoX() {
		move(0, y);
	}
	
	public void placetoY() {
		move(x, 0);
	}
	
}


















