package algorithm;

import java.util.Scanner;

public class Test10798 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    String[][] arr1 = new String[5][];
	    
	    for (int i = 0; i < 5; i++) {
	        String a = s.next();
	        String[] b = new String[a.length()];
	        for (int j = 0; j < a.length(); j++) {
	            String c = Character.toString(a.charAt(j));
	            b[j] = c;
	        }
	        arr1[i] = b;
	    }

	    // Printing the contents of arr1 to verify the characters are stored correctly.
	    for (int j = 0; j < arr1[0].length; j++) {
	        for (int i = 0; i < 5; i++) {
	            if (j < arr1[i].length) {
	                System.out.print(arr1[i][j]);
	            }
	        }
	    }
	}

}
