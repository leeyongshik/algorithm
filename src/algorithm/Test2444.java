package algorithm;

import java.util.Scanner;

public class Test2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int count = a;
		
		for(int i=1; i<=a;i++) {
			for(int j=1; j<=count-1; j++) {
				System.out.print(" ");
			}
			count--;
			int star=0;
			star = star + (i*2)-1;
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
