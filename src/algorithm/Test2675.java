package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        int a = s.nextInt();
        String c;
        String d;
        int b;

        for (int i = 0; i < a; i++) {
            b = s.nextInt();
            c = s.next();
            d = "";
            for (int j = 0; j < c.length(); j++) {
                for (int k = 0; k < b; k++) {
                    d += c.charAt(j);
                }
            }
            list.add(d);
        }

        for (String result : list) {
            System.out.println(result);
        }

	}

}
