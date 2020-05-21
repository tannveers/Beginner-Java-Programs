import java.util.Random;

public class index {
	public static void main(String[] args) {
		Random num = new Random();
		for(int i=0;i<10;i++) {
			int a = num.nextInt(7);
			System.out.println(a);
		}
	}
}
