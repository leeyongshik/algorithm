package algorithm;

import java.util.Scanner;

public class Test1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String a = s.nextLine();
		int count = a.length() - a.replace(" ", "").length();
		if(a.replace(" ", "").length() == 0) {
			System.out.println(1);
		} else {			
			System.out.println(count + 1);
		}
		
	}

}
