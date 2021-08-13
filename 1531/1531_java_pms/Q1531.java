package q1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1531 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] picture = new int[100][100];	//	100x100 배열 생성
		for(int[] row: picture) {	//배열 내 값을 전부 0으로 초기화
			Arrays.fill(row, 0);
		}
		
		for(int i = 0; i < n; i++) {	// 종이가 덮이는 부분을 한 겹당 +1
			StringTokenizer paper = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(paper.nextToken()) -1;
			int y1 = Integer.parseInt(paper.nextToken()) -1;
			int x2 = Integer.parseInt(paper.nextToken()) -1;
			int y2 = Integer.parseInt(paper.nextToken()) -1;
			for(int j = y1; j <= y2; j++) {
				for(int k = x1; k <= x2; k++) {
					picture[j][k]++;
				}
			}
			
			
		}
		
		int cnt = 0;
		for(int i = 0; i < 100; i++) {	//종이가 m번 넘게 덮여있는 부분을 카운트
			for(int j = 0; j < 100; j++) {
				if(picture[i][j] > m) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		

	}

}
