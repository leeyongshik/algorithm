package algorithm;

import java.util.Scanner;

public class Test11021 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int cnt = s.nextInt();
		
		int[] cntAr = new int[cnt];
		
		for (int i=0; i<cnt; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			cntAr[i] = a+b;
		}
		for (int i = 0; i<cnt;i++) {
			System.out.println("Case #"+(i+1)+": "+cntAr[i]);
		}
		
		
		
		
	}

}
