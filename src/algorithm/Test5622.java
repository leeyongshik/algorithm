package algorithm;

import java.util.Scanner;

public class Test5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		int sum=0;
		
		for(int i=0; i <a.length(); i++) {
			
			switch(a.charAt(i)) {
				case 'A' : case 'B' : case 'C' : 
					sum += 3;
					break;
				case 'D' : case 'E' : case 'F' : 
					sum += 4;
					break;
				case 'G' : case 'H' : case 'I' : 
					sum += 5;
					break;
				case 'J' : case 'K' : case 'L' : 
					sum += 6;
					break;
				case 'M' : case 'N' : case 'O' : 
					sum += 7;
					break;
				case 'P' : case 'Q' : case 'R' : case 'S' : 
					sum += 8;
					break;
				case 'T' : case 'U' : case 'V' : 
					sum += 9;
					break;
				case 'W' : case 'X' : case 'Y' : case 'Z' : 
					sum += 10;
					break;
			}
			
//			if(a.charAt(i) == 'A' || a.charAt(i) == 'B' || a.charAt(i) == 'C') {
//				sum += 3;
//			}
//			if(a.charAt(i) == 'D' || a.charAt(i) == 'E' || a.charAt(i) == 'F') {
//				sum += 4;
//			}
//			if(a.charAt(i) == 'G' || a.charAt(i) == 'H' || a.charAt(i) == 'I') {
//				sum += 5;
//			}
//			if(a.charAt(i) == 'J' || a.charAt(i) == 'K' || a.charAt(i) == 'L') {
//				sum += 6;
//			}
//			if(a.charAt(i) == 'M' || a.charAt(i) == 'N' || a.charAt(i) == 'O') {
//				sum += 7;
//			}
//			if(a.charAt(i) == 'P' || a.charAt(i) == 'O' || a.charAt(i) == 'R' || a.charAt(i) == 'S') {
//				sum += 8;
//			}
//			if(a.charAt(i) == 'T' || a.charAt(i) == 'U' || a.charAt(i) == 'V') {
//				sum += 9;
//			}
//			if(a.charAt(i) == 'W' || a.charAt(i) == 'X' || a.charAt(i) == 'Y' || a.charAt(i) == 'Z') {
//				sum += 10;
//			}
			
		}
		System.out.println(sum);
		
	}

}
