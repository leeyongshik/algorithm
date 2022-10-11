package algorithm;

import java.util.Scanner;

public class Test1110 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();	//입력
		int copy = a;		//변수 복사
		int count = 0;
		 
		while(true){
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			count++;
		 
			if(copy == a){
				break;
			}
		}
		System.out.println(count);
	}
}