package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test9063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> xList = new ArrayList<Integer>();
		ArrayList<Integer> yList = new ArrayList<Integer>();
		
		int count = s.nextInt();
		
		for(int i=1; i<=count; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			xList.add(x);
			yList.add(y);
		}
		
		int xMax = Collections.max(xList);
		int yMax = Collections.max(yList);
		int xMin = Collections.min(xList);
		int yMin = Collections.min(yList);
		
		System.out.println((xMax-xMin) * (yMax-yMin));
		
		

	}

}
