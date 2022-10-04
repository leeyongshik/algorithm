package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10952 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		while(true) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			list.add(a+b);
			
			if (a ==0 && b==0) break;
		}
		
		for(int i =0; i<list.size()-1;i++) {
			System.out.println(list.get(i));
		}

	}

}
