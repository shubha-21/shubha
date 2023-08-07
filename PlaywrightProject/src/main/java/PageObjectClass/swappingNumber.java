package PageObjectClass;

public class swappingNumber {
	public static void main(String[] args) {
		int a =20;
		int b=30;
		a=a+b;//20+30=50
		b=a-b;//50-30=20
		a=a-b;//50-20=30
		
		System.out.println("a =" + a + "and b =" + b);
	}

}
