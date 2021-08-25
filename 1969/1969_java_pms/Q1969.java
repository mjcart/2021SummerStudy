package q1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1969 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int hamming = 0;
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		
		for(int i = 0; i < m; i++) {		// 문자열의 맨 앞 자리부터 한 자리씩 순회 
			int[] count = new int[4];		// 해당 자리의 각 문자의 개수를 저장할 배열 생성
			for(int j = 0; j < n; j++) {	// 서로다른 n개의 문자열의 같은 자리를 순회
				switch (s[j].charAt(i)) {	// 해당 자리의 문자를 읽어 각 문자별로 다른 인덱스 번호에 그 수를 저장 
				case 'A':
					count[0]++;
					break;
				case 'C':
					count[1]++;
					break;
				case 'G':
					count[2]++;
					break;
				case 'T':
					count[3]++;
					break;
				}
			}
			int max = 0;
			int index = 0;
			for(int k = 0; k < 4; k++) {	//해당 자리에 가장 중복이 많은 문자의 갯수와 인덱스 번호를 저장 
				if(count[k] > max) {
					max = count[k];
					index = k;
				}
			}
			switch(index) {					//가장 중복이 많은 문자의 인덱스 번호에 따라 문자 출력 
			case 0:
				System.out.print('A');
				break;
			case 1:
				System.out.print('C');
				break;
			case 2:
				System.out.print('G');
				break;
			case 3:
				System.out.print('T');
				break;
			}
			hamming += n - max;				// n 개중 선택된 문자 이외의 문자 개수를 hamming에 더해줌
			
		}
		System.out.println();
		System.out.println(hamming);

	}

}
