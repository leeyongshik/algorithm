package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		String a = s.next();
		String b = a.toUpperCase();
		
		
		
		for(int i=0; i < a.length(); i++) {
			if(list.contains(b.charAt(i)+"")) {
			}else {
			list.add(b.charAt(i)+"");
			System.out.println(b.charAt(i)+"");
			}
		}
		
		System.out.println(list);
		
		for(int i=0; i < list.size(); i++) {
			
		}

	}

}
