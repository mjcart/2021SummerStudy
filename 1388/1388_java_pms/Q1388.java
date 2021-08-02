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
		char[][] room = new char[n][m];	// �� ũ���� 2���� �迭 ����
		
		for(int i = 0; i < n; i++) {	// �� ũ���� 2���� �迭�� �������� �Է�
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				room[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i != 0 && room[i][j] == '|' && room[i - 1][j] == '|') {	// |�� ���Ʒ��� �̾��� ������ �Ѱ��� ����ϹǷ� �� ������ �������� �ʴ´�.
					continue;
				}else if(j != 0 && room[i][j] == '-' &&room[i][j - 1] == '-') {	// -�� �¿�� �̾��� ������ �Ѱ��� ����ϹǷ� �� ������ �������� �ʴ´�.
					continue;
				}
				result++;
			}
		}
		System.out.println(result);
		
	}

}
