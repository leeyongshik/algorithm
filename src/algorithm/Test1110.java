package algorithm;

import java.util.Scanner;

public class Test1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt =0;
		int b=0;
		String a = s.next();
		
		while(true) {
		if (Integer.parseInt(a) < 10) a = 0+a;
		b = (a.charAt(0)-'0')+(a.charAt(1)-'0');
		String c = b+"";
		cnt++;
		//if(a == Integer.parseInt(c))break;
		}
		

	}

}
