package lesson201215;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ObserverAndAnonymousClasses {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Demo");
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.setPreferredSize(new Dimension(400, 400));
		
		JButton button = new JButton("Click me!");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e);
			}
		});
		
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(e);
			}
		});
		
		frame.add(button);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}

}
