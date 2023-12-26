package algorithm;

import java.util.Scanner;

public class Test9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		for(int a = 1; a<=2; a++) {
			int b = s.nextInt();
			
			for(int c = 1; c<=b; c++) {
				if(b / c == 0) {
					System.out.println(c);
				}
			}
		}
	}

} 
     