import javax.swing.JFrame;

public class index{
	public static void main(String[] args) {
		one obj = new one();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(350,100);
		obj.setVisible(true);
	}
}

// Another class in the same package

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class one extends JFrame{
	public JButton a;
	public JButton b;
	
	public one() {
		super("Title");
		setLayout(new FlowLayout());
		
		a = new JButton("click me");
		b = new JButton("click me too!");
		add(a);
		add(b);
		Handlerclass handler = new Handlerclass();
		
		a.addActionListener(handler);
		b.addActionListener(handler);
	}
	private class Handlerclass implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
		}
	}
}		

