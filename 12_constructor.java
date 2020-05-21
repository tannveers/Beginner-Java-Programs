import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		one obj1 = new one("Ronaldo");
		one obj2 = new one("Messi");
		obj1.display();
		obj2.display();
	}
}

// different class in the same package

public class one {
	private String name;
	
	public one(String s) {
		name = s;
	}
	
	public void display() {
		System.out.printf("The entered name is %s",name);
	}
}


