package algorithm;

import java.util.Scanner;

public class Test1330 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a > b) System.out.println(">");
		if(a < b) System.out.println("<");
		if(a == b) System.out.println("==");

	}

}
