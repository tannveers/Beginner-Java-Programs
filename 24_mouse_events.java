import javax.swing.JFrame;

public class index{
	public static void main(String[] args) {
		one obj = new one();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,100);
		obj.setVisible(true);
	}
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class one extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public one() {
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.cyan);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
		Hand handler = new Hand();
		mousepanel.addMouseListener(handler);
		statusbar.addMouseMotionListener(handler);
		
	}
	
	public class Hand implements MouseListener, MouseMotionListener{

		public void mouseDragged(MouseEvent e) {
			statusbar.setText("You dragged the mouse");
			
		}

		public void mouseMoved(MouseEvent e) {
			statusbar.setText("Moved");
			
		}
		public void mouseClicked(MouseEvent e) {
			statusbar.setText(String.format("Clicked %d, %d",e.getX(),e.getY()));
			
		}

		public void mousePressed(MouseEvent e) {
			statusbar.setText("Pressed");
			
		}
		public void mouseReleased(MouseEvent e) {
			statusbar.setText("Released");
			
		}

		public void mouseEntered(MouseEvent e) {
			statusbar.setText("Mouse entered");
			mousepanel.setBackground(Color.GREEN);
		}

		public void mouseExited(MouseEvent e) {
			statusbar.setText("EXIT");
			mousepanel.setBackground(Color.WHITE);
			
		}
		
	}
}