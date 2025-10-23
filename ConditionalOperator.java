package operators;
import java.util.*;
public class ConditionalOperator {

	public static void main(String[] args) {
		//Ternary/Conditional operator
			Scanner Sc=new Scanner(System.in);
			int a,b,c;
			System.out.println("Enter 3 numbers : ");
			a=Sc.nextInt();
			b=Sc.nextInt();
			c=Sc.nextInt();

			String s=(a>b && a>c)?"a is greater":(b>a && b>c)?"b is greater":"c is greater";
			System.out.println(s);
	}

}
