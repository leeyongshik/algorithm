package algorithm;

import java.util.Scanner;

public class Test11720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		String b = s.next();
		int sum = 0;
		for(int i=0; i<b.length(); i++) {
			sum += b.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
