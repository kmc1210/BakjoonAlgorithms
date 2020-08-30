import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); //사과
		int b=sc.nextInt(); //오렌지
		int c=sc.nextInt();//사과
		int d=sc.nextInt();//오렌지
		
		System.out.println(a+d>b+c?b+c:a+d);
		
		
	}
	
}
