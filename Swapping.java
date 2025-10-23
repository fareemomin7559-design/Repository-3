package operators;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// Swapping of 2 variables by using operators
		Scanner Sc=new Scanner(System.in);
		int a,b,temp;
		System.out.println("Enter 2 Variables :");
		a=Sc.nextInt();
		b=Sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: a="+a+" b="+b);
	}

}
