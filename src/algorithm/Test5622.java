package algorithm;

import java.util.Scanner;

public class Test5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		int sum=0;
		
		for(int i=0; i <a.length(); i++) {
			
			if(a.charAt(i) == 'A' || a.charAt(i) == 'B' || a.charAt(i) == 'C') {
				sum += 3;
			}
			if(a.charAt(i) == 'D' || a.charAt(i) == 'E' || a.charAt(i) == 'F') {
				sum += 4;
			}
			if(a.charAt(i) == 'G' || a.charAt(i) == 'H' || a.charAt(i) == 'I') {
				sum += 5;
			}
			if(a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L') {
				sum += 6;
			}
			if(a.charAt(i) == 'M' || a.charAt(i) == 'N' || a.charAt(i) == 'O') {
				sum += 7;
			}
			if(a.charAt(i) == 'P' || a.charAt(i) == 'O' || a.charAt(i) == 'R' || a.charAt(i) == 'S') {
				sum += 8;
			}
			if(a.charAt(i) == 'T' || a.charAt(i) == 'U' || a.charAt(i) == 'V') {
				sum += 9;
			}
			if(a.charAt(i) == 'W' || a.charAt(i) == 'X' || a.charAt(i) == 'Y' || a.charAt(i) == 'Z') {
				sum += 10;
			}
			
		}
		System.out.println(sum);
		
	}

}
