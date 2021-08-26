package q2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = n; i > 0; i--) {	// n���� 1���� �ڿ����� ������ ���� ū ���� �ϳ��� �ٿ����� �Ǵ�
			int sum = i;		// �ش� ȸ���� �ڿ����� ���� �̿��� ������ ��� ����
			int j = 1;			// ������ �ݺ��� Ƚ���� �����ϴ� �ε���
			
			while(true) {		
				if(sum == n) {	// �ڿ������� ���� n�� ���ٸ� cnt�� ������Ű�� ����	
					cnt++;
					break;
				}else if(sum > n) {	// �ڿ������� ���� n���� ũ�ٸ� �Ұ����� ȸ���̹Ƿ� ����
					break;
				}else if(j == i) {	// i ���� 0���� ��� ���ص� n�� ���� �������� ���Ѵٸ� ����
					break;
				}
				sum += i-j;
				j++;
			}
		}
		System.out.println(cnt);

	}

}
