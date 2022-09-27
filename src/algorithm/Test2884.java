package algorithm;

import java.util.Scanner;

public class Test2884 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (b >=45) System.out.println(a+" "+(b-45));
		else {
			if (a ==0 )System.out.println("23 "+(b+60-45));
			else System.out.println((a-1)+" "+(b+60-45));
		}

	}

}
