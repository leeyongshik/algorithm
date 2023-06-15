package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		
		String a = s.next();
		String b = a.toUpperCase();
		
		for(int i=0; i < a.length(); i++) {
			if(list.contains(b.charAt(i)+"")) {
			}else {
			list.add(b.charAt(i)+"");
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			int count = b.length() - b.replace(list.get(i), "").length();
			countList.add(count);
		}
		
		int max = countList.get(0);
		
		for(int num : countList) {
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println(list);
		System.out.println(countList);
		
		int maxcount=0;
		for(int i : countList) {
			if(i == max) {
				maxcount++;
			}
		}
		if(maxcount==1) {
			System.out.println(max);
		}else {
			System.out.println("?");
		}
	}
	

}
