import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a+" "+b);	
}}
