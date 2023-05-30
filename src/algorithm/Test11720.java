package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test11720 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a = s.nextInt();
		String b = s.next();
		int sum = 0;
		System.out.println(b.charAt(0));
		System.out.println(b.charAt(1));
		for(int i=0; i<b.length(); i++) {
			list.add((int) b.charAt(i));
		}
		System.out.println(list);
	}

}
