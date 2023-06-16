package algorithm;

import java.util.Scanner;

public class Test2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String[] change = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String a = s.next();
		int count = 0;
		
		for(int i =0; i< change.length; i++) {
			if(a.contains(change[i])) {
				int b = change[i].length();
				count += (a.length() - a.replace(change[i], "").length()) / change[i].length();
				System.out.println(count); 
			}
		}
		
		
		
	}

}
