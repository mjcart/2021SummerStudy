package q1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q1417 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int dasom = Integer.parseInt(br.readLine());	//�ټ����� ��ǥ�� ����
		int result = 0;
		
		ArrayList<Integer> vote = new ArrayList<Integer>();
		for(int i = 0; i < n-1; i++) {					//�ټ��̸� ������ ������ �ĺ����� ��ǥ�� ���� 
			vote.add(Integer.parseInt(br.readLine()));
		}
		
		if(n == 1) {	// n�� 1�� ��� �ĺ��� �ټ��� ȥ���̹Ƿ� ���� 0 ��� 
			System.out.println(0);
			return;
		}
		
		while(Collections.max(vote) >= dasom) {	// �ٸ� �ĺ��ڵ� �� �ִ밪�� �ټ����� ǥ���� �������� ���� 
			int i = vote.indexOf(Collections.max(vote));
			vote.set(i, vote.get(i) - 1);		// �ִ밪�� ���� �ĺ����� ǥ ���� �ϳ� ���̰� �ټ����� ǥ ���� �ϳ� �ø�
			dasom++;
			result++;
		}
		
		System.out.println(result);
		

	}

}
