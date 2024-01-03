package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		int input = 0;
        while (input != -1) {
            input = s.nextInt();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            
            if (input != -1) {
            	int sum = 0;
                // -1이 아닌 경우에만 실행할 코드 작성
                for(int i=1; i<input; i++) {
                	if(input % i == 0) {
                		sum += i;
                		list2.add(i);
                	}
                }
                if(input == sum) {
                	String intSum = sum + " = ";
                	for(Integer a : list2) {
                		if(list2.get(0) == a) {
                			intSum += a;
                		}else {                			
                			intSum += " + " + a;
                		}
                	}
                	list.add(intSum);
                }else {
                	list.add(input + " is NOT perfect.");
                }
                // 원하는 작업을 수행
            }
        }
        for(String a : list) {
        	System.out.println(a);
        }
        s.close();
	}

} 
       