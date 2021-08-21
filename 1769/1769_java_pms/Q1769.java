package q1769;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1769 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		
		int cnt = 0;	// ��ȯ ������ ��ģ Ƚ��
		
		while(true) {
			long sum = 0;
			if(x.length() == 1) {	// x�� ���ڸ��� ��� ��ȯ ���� ���� 
				break;
			}
			for(int i = 0; i < x.length(); i++) {	// �� �ڸ��� ��� ���� 
				sum += Integer.parseInt(String.valueOf(x.charAt(i)));
			}
			cnt++;
			x = String.valueOf(sum);	// ��ȯ ����� x�� �־���
		}
		
		if(Integer.parseInt(String.valueOf(x)) % 3 == 0) {	// ��ȯ ����� 3�� ������� �Ǵ�
			System.out.println(cnt);
			System.out.println("YES");
		}else {
			System.out.println(cnt);
			System.out.println("NO");
		}
	}
}
