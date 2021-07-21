package q1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {

	public static char[][] inputarr;
	public static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		inputarr = new char[a][b];
		
		for (int i = 0; i < a; i++ ) {
			String sr = bf.readLine();
			for(int j = 0; j < b; j++) {
				inputarr[i][j] = sr.charAt(j);
			}
		}
		

		for(int i = 0; i < a-7;i++) {
			for(int j = 0; j < b-7; j++) {
				judgment(i,j);
			}
		}
		
		System.out.println(min);
	}
	
	static void judgment(int n, int m) {
		int cnt1 = 0; //W로 시작하는 경우의 비교 
		int cnt2 = 0; //B로 시작하는 경우의 비교
		char stand1 = 'W'; //W로 시작하는 경우의 비교 
		char stand2 = 'B'; //B로 시작하는 경우의 비교
		int small;
		for(int i = n; i < n + 8; i++) {
			for(int j = m; j < m + 8; j++) {
				if(inputarr[i][j] != stand1) {
					cnt1++;
				}
				if(inputarr[i][j] != stand2) {
					cnt2++;
				}
				
				if(stand1 == 'W') {
					stand1 = 'B';
				}else {
					stand1 = 'W';
				}
				if(stand2 == 'W') {
					stand2 = 'B';
				}else {
					stand2 = 'W';
				}
			}
			
			if(stand1 == 'W') { //한 가로열이 끝나고 새로운 열로 넘어가면 B - > W 순서가 아니라 B - > B 순서가 되므로 한번 더 뒤집어 줌 
				stand1 = 'B';
			}else {
				stand1 = 'W';
			}
			if(stand2 == 'W') {
				stand2 = 'B';
			}else {
				stand2 = 'W';
			}
		}
		
		small = Math.min(cnt1, cnt2);
		min = Math.min(min, small);

		
	}

}
