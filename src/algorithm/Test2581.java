package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = s.nextInt();
		int b = s.nextInt();
		int total = 0;
		for(int i=a; i<=b; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				list.add(i);
			}
		}
		for(Integer aa : list) {
			total += aa;
		}
		System.out.println(total);
		System.out.println(list.get(0));

	}

}
