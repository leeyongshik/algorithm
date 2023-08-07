package algorithm;

import java.util.Scanner;

public class Test2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		s.close();
		int total = 0;
		int count = 0;
		
		for(int i=0; i<c; i++) {
			count++;
			total += a;
			if(total >= c) {
				break;
			}
			total -= b;
		}
		System.out.println(count);

	}

}
