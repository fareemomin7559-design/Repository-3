package operators;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		//Ternary/Conditional operator
		Scanner Sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 2 numbers : ");
		a=Sc.nextInt();
		b=Sc.nextInt();
		String s=(a>b)?"a is greater":"b is greater";
		System.out.println(s);
		

	}

}
