package algorithm;

import java.util.Scanner;

public class Test2588 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(((b%100)%10)*a);
		System.out.println(((b%100)/10)*a);
		System.out.println((b/100)*a);
		System.out.println(a*b);

	}

}
