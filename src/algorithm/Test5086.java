package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5086 {
	
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        String c = "factor";
        String d = "multiple";
        String e = "neither";
        while(true) {
        	int a = s.nextInt();
        	int b = s.nextInt();
        	
        	if(a == 0 && b == 0) {
        		break;
        	} else {
        		if(b%a == 0) {
    				list.add(c);
    			}else {
    				if(a%b ==0) {
    					list.add(d);
    				}else {
    					list.add(e);
    				}
    			}
    		}
    	}
        
        for(String string : list) {
        	System.out.println(string);
        }
    }

}
