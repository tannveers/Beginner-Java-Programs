import javax.swing.JFrame;

public class index{
	public static void main(String[] args) {
		one obj = new one();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(200,100);
		obj.setVisible(true);
	}
}

// Another class in the same package

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class one extends JFrame {
	public one() {
		super("Title of the window");
		setLayout(new FlowLayout());
		JLabel item = new JLabel("This is a sentence");
		add(item);
		item.setToolTipText("Close the window");
	}
}

