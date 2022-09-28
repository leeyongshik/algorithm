package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test15552 {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1;
		
		int t = Integer.parseInt(br.readLine());
		for ( int i = 0; i<t; i++) {
			st1 = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st1.nextToken())+Integer.parseInt(st1.nextToken()))+"\n");
		}
		bw.close();
		
		
		
		
		
	}

}
