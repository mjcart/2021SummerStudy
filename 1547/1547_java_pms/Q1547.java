package q1547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		int cup[] = {0, 1, 0, 0};
				
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int temp = cup[x];
			cup[x] = cup[y];
			cup[y] = temp;
		}
		
		for(int i = 1; i < 4; i++) {
			if(cup[i] == 1) {
				System.out.println(i);
				return;
			}
		}
	}

}
