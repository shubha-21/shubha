package PageObjectClass;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		boolean flag = true;
		for (int i=2;i<a;i++) {
		if(a%2==0) {
			flag = false;
		}
		}
		 if (flag==true) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");}
	}}
	

