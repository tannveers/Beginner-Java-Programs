import java.util.Scanner;

public class index {
	public static void main(String[] args) {
		int fnum,snum,result;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("enter first number to add");
		fnum = inp.nextInt();
		
		System.out.println("enter second number to add");
		snum = inp.nextInt();
		
		result = fnum + snum;
		System.out.println(result);
	}
}
