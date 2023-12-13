package algorithm;

import java.util.Scanner;

public class Test1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        s.close();

        int line = 1;
        int sum = 1;

        while (sum < X) {
            line++;
            sum += line;
        }

        int numerator, denominator;
        if (line % 2 == 0) { // 짝수 라인
            numerator = line - (sum - X);
            denominator = 1 + (sum - X);
        } else { // 홀수 라인
            numerator = 1 + (sum - X);
            denominator = line - (sum - X);
        }

        System.out.println(numerator + "/" + denominator);

	}

}
   