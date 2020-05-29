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

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class one extends JFrame{
	
	private Font pf;
	private Font itf;
	private Font bf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton bib;
	private JRadioButton ib;
	private JTextField tf;
	private ButtonGroup bg;
	
	public one(){
		super("Title");
		setLayout(new FlowLayout());
		tf = new JTextField("Tanveer is very hot!",20);
		add(tf);
		
		pb = new JRadioButton("plain",true);
		bb = new JRadioButton("bold",false);
		bib = new JRadioButton("bold italic",false);
		ib = new JRadioButton("italic",false);
		add(pb);
		add(bb);
		add(bib);
		add(ib);
		bg = new ButtonGroup();
		bg.add(pb);
		bg.add(bb);
		bg.add(bib);
		bg.add(ib);
		
		pf = new Font("Serif",Font.PLAIN,20);
		bf = new Font("Serif",Font.BOLD,20);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC,20);
		itf = new Font("Serif",Font.ITALIC,20);
		tf.setFont(pf);
		
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		bib.addItemListener(new HandlerClass(bif));
		ib.addItemListener(new HandlerClass(itf));
	}
		private class HandlerClass implements ItemListener{
			private Font font;
			
			private HandlerClass(Font f) {
				font = f;
			}
			public void itemStateChanged(ItemEvent e) {
				tf.setFont(font);
			}
			
			
		}
	
}