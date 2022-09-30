package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10871 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		int cnt = s.nextInt();
		int a = s.nextInt();
		
		for(int i =1; i <=cnt; i++) {
			list.add(s.nextInt());
		}
		
		for (int i=0; i < list.size();i++) {
			if(list.get(i) < a ) System.out.print(list.get(i) + " ");
		}
		
		
		

	}

}
