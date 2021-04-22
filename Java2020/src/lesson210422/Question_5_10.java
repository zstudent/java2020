package lesson210422;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question_5_10 {
	
	public static void main(String[] args) {
//		new Y();  compilation error
		
		
		new I() {
			
		};
		
		new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

}

interface I {}
interface J {}
interface K extends I, J {}

@FunctionalInterface
interface M {
	void m();
	default void n() {}
}

class X {
	
}


abstract class Y extends X {
	
}