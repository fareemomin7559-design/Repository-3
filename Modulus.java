package operators;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		// Use Modulus arithmatic operator
		int a,b;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		a=Sc.nextInt();
		b=Sc.nextInt();
		System.out.println("Modulus =\n "+(a%b));


	}

}
