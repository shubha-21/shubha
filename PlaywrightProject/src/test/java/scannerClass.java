import java.util.Scanner;

public class scannerClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = add(a,b);
		System.out.println(c);
	}

	private static int add(int a, int b) {
		int c = a+b;
		
		return c;
	}

}

