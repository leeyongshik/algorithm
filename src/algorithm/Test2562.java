package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test2562 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList list = new ArrayList<>();
		
		
		for(int i=1; i<=9; i++) {
			int a = s.nextInt();
			list.add(a);
		}

		System.out.println(Collections.max(list));
		System.out.println(list.indexOf(Collections.max(list))+1);
	}

}
