package algorithm;

import java.util.Scanner;

public class Test2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		String c,d;
		
		c = a%10 + "" + (a/10)%10 + ((a/10)/10)%10;
		d = b%10 + "" + (b/10)%10 + ((b/10)/10)%10;
		if(Integer.parseInt(c)>Integer.parseInt(d)) {
			
			System.out.println(c);
		} else {
			
			System.out.println(d);
		}
	}

}
