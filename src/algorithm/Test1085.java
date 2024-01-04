package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int x = s.nextInt();
		int y = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		
		list.add(Math.abs(x-0));
		list.add(Math.abs(w-x));
		list.add(Math.abs(h-x));
		list.add(Math.abs(y-0));
		list.add(Math.abs(w-y));
		list.add(Math.abs(h-y));
		
		int minValue = list.get(0);
		for(Integer obj : list) {
			if (obj < minValue) {
                minValue = obj;
            }
		}
		System.out.println(minValue);
	}

}
