package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner s = new Scanner(System.in);
		
		int paper = s.nextInt();
		int x;
		int y;
		ArrayList<String[]> arrayListsOfArrays = new ArrayList<>();
		
		
		for(int i=1; i<= paper; i++) {
			x = s.nextInt();
            y = s.nextInt();
            
           int[] xArr = new int[10];
           int[] yArr = new int[10];
           String[] totalArr = new String[100];
           
           for(int j=0; j<10; j++) {
        	   xArr[j] = x+j;
        	   yArr[j] = y+j;
           }
           
           int index = 0; // Initialize an index variable to track the position in totalArr

           for (int j = 0; j < 10; j++) {
               for (int k = 0; k < 10; k++) {
                   totalArr[index] = Integer.toString(xArr[j]) + Integer.toString(yArr[k]);
                   index++;
               }
           }
           arrayListsOfArrays.add(totalArr);
		}
		
		// Use a HashSet to track unique elements
        HashSet<String> uniqueElements = new HashSet<>();
        int totalDuplicates = 0;

        // Traverse the arrayListsOfArrays and count duplicates
        for (String[] arr : arrayListsOfArrays) {
            for (String element : arr) {
                if (uniqueElements.contains(element)) {
                    totalDuplicates++;
                } else {
                    uniqueElements.add(element);
                }
            }
        }

        System.out.println(paper * 100 - totalDuplicates);
	}

}
