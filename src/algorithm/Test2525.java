package algorithm;

import java.util.Scanner;

public class Test2525 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int d = (b+c)/60;
		int e = (b+c)%60;
		
		int f =	a + d;//최종시
		
		if ( f >= 24 )System.out.println((f-24)+" "+e);
		else System.out.println(f+" "+e);


	}

}