package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9086 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		int a = s.nextInt();
		
		for(int i=1; i<= a; i++) {
			String b = s.next();
			list.add(b.charAt(0)+""+b.charAt(b.length()-1));
		}
		for(int i=0; i< a; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
