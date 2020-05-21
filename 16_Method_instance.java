import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		one obj = new one();
		String temp = inp.nextLine();
		obj.set(temp);
		obj.display();
	}
}

// different class in the same package

public class one {
	private String name;
	public void set(String s) {
		name = s;
	}
	public void display() {
		System.out.printf("The entered name is %s",name);
	}
}


