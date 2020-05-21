public class index {
	public static void main(String[] args) {
		one obj = new one();
		obj.func();
	}
}

// different class in the same package

public class one {
	public void func() {
		System.out.println("Hello");
	}
}


