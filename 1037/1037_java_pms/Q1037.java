package q1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> inputarr = new ArrayList<Integer>();
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		for(int i = 0; i < n; i++) {
			inputarr.add(Integer.parseInt(st.nextToken()));
		}
		int min = Collections.min(inputarr);
		int max = Collections.max(inputarr);
		System.out.println(min * max);

	}

}
