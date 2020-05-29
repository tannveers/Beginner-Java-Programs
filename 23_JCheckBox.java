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
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class one extends JFrame{
	
	private JCheckBox bold;
	private JCheckBox ital;
	private JTextField tf;
	
	public one() {
		super("Window");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Font to be changed");
		tf.setFont(new Font("Serif",Font.PLAIN,20));
		bold = new JCheckBox("bold");
		ital = new JCheckBox("italic");
		add(tf);
		add(bold);
		add(ital);
			
	Handlerclass handler = new Handlerclass();
	bold.addItemListener(handler);
	ital.addItemListener(handler);
}
	private class Handlerclass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(bold.isSelected() && ital.isSelected()) {
				font = new Font("Serif",Font.BOLD + Font.ITALIC,20);}
			else if(bold.isSelected()) {
					font = new Font("Serif",Font.BOLD,20);
				}
			else if(ital.isSelected()){	
				font = new Font("Serif",Font.ITALIC,20);
				}
			else font = new Font("Serif",Font.PLAIN,20);
			 
			 tf.setFont(font);
		}
			}
		
	}


