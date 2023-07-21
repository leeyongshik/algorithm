package algorithm;

import java.util.Scanner;

public class Test2738 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int[][] list1 = new int[n][m];
		int[][] list2 = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j< m; j++) {
				list1[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j =0; j< m; j++) {
				list2[i][j] = s.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j =0; j< m; j++) {
				System.out.print(list1[i][j] + list2[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
