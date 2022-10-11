package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test10818 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = s.nextInt();
			list.add(b);
		}
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));

	}

}
