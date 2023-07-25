package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> total = new ArrayList<>();
		
		int a = s.nextInt();
		
		for(int i=0; i<a; i++) {
			int b = s.nextInt();
			int Quarter = b/25;
			int Dime = (b%25)/10;
			int Nickel = ((b%25)%10)/5;
			int Penny = (((b%25)%10)%5)/1;
			
			total.add(Quarter + " " + Dime + " " + Nickel + " " + Penny);
		}
		
		for(String c : total) {
			System.out.println(c);
		}
	}

}
