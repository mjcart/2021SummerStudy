package q1388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1388 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer nm = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(nm.nextToken());
		int m = Integer.parseInt(nm.nextToken());
		int result = 0;
		char[][] room = new char[n][m];	// 방 크기의 2차원 배열 생성
		
		for(int i = 0; i < n; i++) {	// 방 크기의 2차원 배열에 나무판자 입력
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				room[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i != 0 && room[i][j] == '|' && room[i - 1][j] == '|') {	// |가 위아래로 이어져 있으면 한개로 계산하므로 총 개수를 더해주지 않는다.
					continue;
				}else if(j != 0 && room[i][j] == '-' &&room[i][j - 1] == '-') {	// -가 좌우로 이어져 있으면 한개로 계산하므로 총 개수를 더해주지 않는다.
					continue;
				}
				result++;
			}
		}
		System.out.println(result);
		
	}

}
