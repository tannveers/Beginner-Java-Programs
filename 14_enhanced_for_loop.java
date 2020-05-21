import java.util.Random;

public class index {
	public static void main(String[] args) {
		Random num = new Random();
		int[] arr = new int[10];
		int inp;
		for(int i=0;i<10;i++) {
			inp = num.nextInt(20);
			arr[i]=inp;
		}
		for(int i: arr)System.out.println(i); // advanced for loop
	}
}
