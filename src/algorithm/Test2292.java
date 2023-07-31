package algorithm;

import java.util.Scanner;

public class Test2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int add = 0;
		int c;
		int count =0;
		for(int i=0; i<a; i++) {
			add += i;
			c = 1+(6*add);
			count++;
			if(a <= c) {
				break;
			}
		}
		System.out.println(count);
	}

}
