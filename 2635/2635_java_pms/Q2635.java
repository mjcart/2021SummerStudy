package q2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2635 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0; 
		ArrayList<Integer> maxlist = new ArrayList<Integer>();	// �ִ� ������ ���� ������ ������ ����Ʈ
		
		for(int i = 1; i <= n; i++) {
			ArrayList<Integer> nowlist = new ArrayList<Integer>();	// �������� ���� ������ ������ ����Ʈ
			nowlist.add(n);										// n�� ����Ʈ�� 1�� i�� ����Ʈ�� 2���� �����صΰ� ��� ���� 
			nowlist.add(i);
			int prev1 = n;
			int prev2 = i;
			
			while(true) {										// ����� 0���� ū ���� �վ� ���ڿ��� �� ���ڸ� ���ذ��� ����Ʈ�� ���� 
				int temp = prev1 - prev2;
				if(temp>=0) {
					nowlist.add(temp);
				}else {
					break;
				}
				prev1 = prev2;									// �վ� ���ڿ� �� ���ڸ� ���� ����
				prev2 = temp;
			}
			if(max < nowlist.size()) {							// �̹� ȸ���� �ִ� ������ ���ڶ�� �ش� ������ max�� �����ϰ� ����Ʈ�� ���� ������ maxlist�� ����
				max = nowlist.size();
				maxlist = nowlist;
			}
		}
		
		System.out.println(max);								// �ִ� ���� �� ������ ���
		for(int i = 0; i < maxlist.size(); i++) {
			System.out.print(maxlist.get(i) + " ");
		}

	}

}
