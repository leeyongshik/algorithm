package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a = s.nextInt();
		int b = s.nextInt(); 
		
		for(int i = 1; i <= a; i++) {      
			if( a % i == 0 ) { 
				list.add(i);   
			}
		} 
		
		if(b > list.size()) {
			System.out.println(0);  
		}else {  
			System.out.println(list.get(b-1));               
		}        
        
	} 

} 
    