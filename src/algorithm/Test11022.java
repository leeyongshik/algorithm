package algorithm;

import java.util.Scanner;

public class Test11022 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int cnt = s.nextInt();
		
		String[] cntAr = new String[cnt];
		
		for (int i=0; i<cnt; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			cntAr[i] = a + " + " + b +" = " + (a+b);
		}
		for (int i = 0; i<cnt;i++) {
			System.out.println("Case #"+(i+1)+": "+cntAr[i]);
		}

	}

}
