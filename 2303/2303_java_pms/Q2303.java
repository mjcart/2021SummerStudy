package q2303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2303 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> nowList = new ArrayList<Integer>();
			
			for(int j = 0; j < 5; j++) {	// �ش� �� ����� ��ȣ ������ nowList�� �޾ƿ� 
				nowList.add(Integer.parseInt(st.nextToken()));
			}
			int max = 0;
			for(int j = 0; j < 3; j++) {	// ��� ������ ���ϸ� �ش� ��ȣ�� ����� ���� �� �ִ� ���� ū ���� ã�Ƽ� list�� ���� 
				for(int k = j+1; k < 4; k++) {
					for(int l = k+1; l < 5; l++) {
						int point = (nowList.get(j) + nowList.get(k) + nowList.get(l)) % 10;
						if(max < point) {
							max = point;
						}
					}
				}
			}
			list.add(max);
		}
		int result = Collections.max(list);	// list���� �ִ밪�� ���� 
		for(int i = list.size()-1; i >= 0; i--) {	// ����Ʈ�� �ں��� ��ȸ�ϸ� �ִ밪�� ����ִ� ��ȣ�� ���� ū ��츦 ã�Ƽ� ����� ���� 
			if(result == list.get(i)) {
				System.out.println(i+1);
				return;
			}
		}

	}

}
