package lesson201214.interfaces;

public interface Points {
	
	default void move(final int x, final int y) {
		setX(x);
		setY(y);
	}
	
	void setX(final int x);

	void setY(int y);

}
