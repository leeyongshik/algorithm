package algorithm;

import java.util.Scanner;

public class Test10988 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		 int mid=(a.length()/2);
	      int sw=1;
	      for(int i=0;i<mid;i++) {
	          if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
	              sw=0;
	          }         
          }
      System.out.println(sw); 
	}
}
