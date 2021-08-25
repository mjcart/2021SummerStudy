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
		
		for(int i = 0; i < m; i++) {		// ���ڿ��� �� �� �ڸ����� �� �ڸ��� ��ȸ 
			int[] count = new int[4];		// �ش� �ڸ��� �� ������ ������ ������ �迭 ����
			for(int j = 0; j < n; j++) {	// ���δٸ� n���� ���ڿ��� ���� �ڸ��� ��ȸ
				switch (s[j].charAt(i)) {	// �ش� �ڸ��� ���ڸ� �о� �� ���ں��� �ٸ� �ε��� ��ȣ�� �� ���� ���� 
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
			for(int k = 0; k < 4; k++) {	//�ش� �ڸ��� ���� �ߺ��� ���� ������ ������ �ε��� ��ȣ�� ���� 
				if(count[k] > max) {
					max = count[k];
					index = k;
				}
			}
			switch(index) {					//���� �ߺ��� ���� ������ �ε��� ��ȣ�� ���� ���� ��� 
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
			hamming += n - max;				// n ���� ���õ� ���� �̿��� ���� ������ hamming�� ������
			
		}
		System.out.println();
		System.out.println(hamming);

	}

}
