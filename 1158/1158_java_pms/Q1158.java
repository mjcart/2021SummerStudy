package q1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> inList = new ArrayList<Integer>();
		ArrayList<Integer> outList = new ArrayList<Integer>();
		for(int i = 0; i < n + 1; i++) {
			inList.add(i);
		}

		int index = 1;
		int countk = 0;
		while(true) {
		
			if(inList.get(index) != 0) {
				countk++;
			}

			if(countk == k) {
				outList.add(inList.get(index));
				inList.set(index, 0);
				countk = 0;
			}
			
			index++;
			
			if(index > inList.size()-1) {
				index = 1;
			}
			
			if(outList.size() == n) {
				break;
			}
			
			
		}
		
		System.out.print("<");
		for(int i = 0; i < outList.size(); i++) {
			if(i == 0) {
				System.out.print(outList.get(i));
			}else {
				System.out.print(", " + outList.get(i));
			}
			
		}
		System.out.print(">");
		

	}

}
