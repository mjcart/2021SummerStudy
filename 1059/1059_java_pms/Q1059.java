package q1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1059 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(bf.readLine());
		ArrayList<Integer> inputarr = new ArrayList<Integer>();
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); 
		for(int i = 0; i < l; i++) {
			inputarr.add(Integer.parseInt(st.nextToken()));
		}
		int n = Integer.parseInt(bf.readLine());
		int start = 0, end = 1001; // ���� s�� ���Ե� ��� ������ 1���� ũ�ų� ����, 1000���� �۰ų� ����.
		
		for(int i : inputarr) { //n�� ���� ����� �� �� �� start, end�� ���� 
			if(i < n) {
				if( i > start) {
					start = i;
				}
			}else if(i > n) {
				if(i < end) {
					end = i;
				}
			}else {	// ����Ʈ�� ���� �� n �� ���� ���� ������ ����� 0�� �ȴ�
				System.out.println(0);
				return;
			}
		}
		
		int cnt = 0;
		

		for(int i = start + 1; i <= n; i++) {
			for(int j = n; j <= end - 1; j++) {
				if(i != j) {	//�̴�� ����ϸ� [n,n]�� ī��Ʈ�� ���ԵǹǷ� �����ϱ� ���� 
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}
