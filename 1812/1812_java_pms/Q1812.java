package q1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1812 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		int first = 0;	// �� ù��° ������ ���� ���ϱ�
		for(int i = 0; i < n; i++) {
			if(i % 2 ==0) {
				first += list.get(i);
			}else {
				first -= list.get(i);
			}
		}
		first /= 2;
		System.out.println(first);
		
		int prev = first;	// �� �Է°����� ���� ������ ������ �� ���� �ش� �ڸ��� ������ ������ ��
		for(int i = 0; i < list.size()-1; i++) {
			int result = list.get(i) - prev;
			prev = result;
			System.out.println(result);
		}

	}

}
