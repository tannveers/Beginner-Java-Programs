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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class one extends JFrame {
	public JTextField item1;
	public JTextField item2;
	public JPasswordField item3;
	
	public one() {
	super("The title");
	setLayout(new FlowLayout()); 
	item1 = new JTextField(10);
	item2 = new JTextField("uneditable",20);
	item2.setEditable(false);
	item3 = new JPasswordField("my pass");
	add(item1);
	add(item2);
	add(item3);

	theHandler handler = new theHandler();
	
	item1.addActionListener(handler);
	item2.addActionListener(handler);
	item3.addActionListener(handler);
	}
	public class theHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String string = "";
			if(event.getSource() == item1)string = String.format("%s",event.getActionCommand());
			else if(event.getSource() == item2)string = String.format("%s",event.getActionCommand());
			else if(event.getSource() == item3)string = String.format("%s",event.getActionCommand());
		JOptionPane.showMessageDialog(null,string);
		}
	}
	
	}
		

