package algorithm;

import java.util.Scanner;

public class Test10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a + b + c == 180) {
			if(a == b) {
				if(b == c) {
					System.out.println("Equilateral");
				}else {
					System.out.println("Isosceles");
				}
			}else if (b == c) {
				if( c == a ) {
					System.out.println("Equilateral");
				}else {
					System.out.println("Isosceles");
				}
			}else if(c == a) {
				if(a == b) {
					System.out.println("Equilateral");
				}else {
					System.out.println("Isosceles");
				}
			} else {
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Error");
		}

	}

}
