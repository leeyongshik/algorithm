package algorithm;

import java.util.Scanner;

public class Test1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int count = 0;
		for(int i=1; i<=a; i++) {
			int b = s.nextInt();
			int resetCount = 0;
			for(int j=1; j<=b; j++) {
				if(b % j == 0) {
					resetCount ++;
				}
			}
			if(resetCount == 2) {
				count ++;
			}
		}
		System.out.println(count);

	}

}
