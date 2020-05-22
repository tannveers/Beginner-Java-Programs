import javax.swing.JOptionPane;


public class index{
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter Second number");
		
		int a = Integer.parseInt(fn);
		int b = Integer.parseInt(sn);
		int x = a+b;
		JOptionPane.showMessageDialog(null,"The Sum is " + x);
	}
}
