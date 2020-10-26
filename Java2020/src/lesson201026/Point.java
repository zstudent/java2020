package lesson201026;

public class Point {

	private int x, y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x) {
		this(x, 0);
	}

	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	private void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int coord) {
		move(coord, coord);
	}
	

}
