package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10807 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int v,a,t;
		int count=0;
		
		v = s.nextInt();
		
		for(int i=0; i<v;i++) {
			a = s.nextInt();
			list.add(a);
		}
		
		t = s.nextInt();
		
		for(int i=0; i<v;i++) {
			if(list.get(i) == t) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
