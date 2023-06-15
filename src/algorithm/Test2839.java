package algorithm;

import java.util.Scanner;

public class Test2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int count = -1;
		
		if(a % 5 == 0) {
			count += a/5;
			
			
			
		}else {
			
		}
		
		if((a%5)%3 == 0) {
			count += (a%5)%3;
		}
		
		System.out.println((a%5)%3);
		System.out.println(count);
	}

}
