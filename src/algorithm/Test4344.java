package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Double> percent = new ArrayList<>();
		
		int a = s.nextInt();
		double[] percentList = new double[a];
		
		for(int i=1; i<=a; i++) {
			int total = 0;
			ArrayList<Integer> list = new ArrayList<>();
			int b = s.nextInt();
			
			for(int j=1; j<=b; j++) {
				int c = s.nextInt();
				total += c;
				list.add(c);
			}
			int avg = total/b;
			int upcount=0;
			for(int j=0; j<list.size();j++) {
				if(avg < list.get(j)) {
					upcount++;
				}
			}
			double c = (double)upcount/list.size() * 100;
			double d = Math.round(c*1000)/1000.0;
			percentList[i-1] = d;
		}
		for(double i : percentList) {
			System.out.println(String.format("%.3f", i) + "%");
		}
	}

}
