public class index {
	public static void main(String[] args) {
		int a=20,b=10;
		
		if(a<15 && b>15) //both conditions need to be true!
			System.out.println("hello!");
		
		else if(a<15 || b<15) //only one condition would work!
			System.out.println("bye!");
		
		else 
			System.out.println("Morning!");
	}
}
