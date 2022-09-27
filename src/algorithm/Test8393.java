package algorithm;

import java.util.Scanner;

public class Test8393 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum=0;
		int a = s.nextInt();
		
		for (int i=1; i<=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		
	}

}
