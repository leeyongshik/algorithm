package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test25206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		List<Object[]> dataList = new ArrayList<>();
		double totalCredit = 0;
		double totalScore = 0;
		
		for(int i =1; i<=20; i++) {
			String subject = s.next();
			double credit = s.nextDouble();
			String score = s.next();
			
			Object[] data = {subject, credit, score};
			dataList.add(data);
		}
		s.close();
		
		for(Object[] data : dataList) {
			totalCredit += (double)data[1];
			if(data[2].equals("A+")) {
				totalScore += (double)data[1] * 4.5;
			}else if (data[2].equals("A0")) {
				totalScore += (double)data[1] * 4.0;
			}else if (data[2].equals("B+")) {
				totalScore += (double)data[1] * 3.5;
			}else if (data[2].equals("B0")) {
				totalScore += (double)data[1] * 3.0;
			}else if (data[2].equals("C+")) {
				totalScore += (double)data[1] * 2.5;
			}else if (data[2].equals("C0")) {
				totalScore += (double)data[1] * 2.0;
			}else if (data[2].equals("D+")) {
				totalScore += (double)data[1] * 1.5;
			}else if (data[2].equals("D0")) {
				totalScore += (double)data[1] * 1.0;
			}else {
				totalScore += (double)data[1] * 0.0;
			}
			
		};
//		double out = totalScore / totalCredit;
//		System.out.println(out);
		System.out.printf("%.6f", totalScore / (int)totalCredit);

	}

}
