package q1205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1205 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int point = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		if(n == 0) {	//n�� 0�̶�� ���� rank�� �ִ� ���� �����Ƿ� �ش� �Է°��� 1���� �ȴ�.
			System.out.println(1);
			return;
		}
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		ArrayList<Integer> ranklist = new ArrayList<Integer>();	//��ŷ ����Ʈ ����
		
		for(int i = 0; i < n; i++) {
			ranklist.add(Integer.parseInt(s.nextToken()));
		}
		
		int rank = 1;
		if(ranklist.size() == p && point <= ranklist.get(ranklist.size()-1)) {	// ���簡���� ��ŷ����Ʈ�� ���� �� �ְ� �Է°��� �� ������ ���� ���ų� �۴ٸ� -1�� ����Ѵ�.
			System.out.println(-1);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(point >= ranklist.get(i)) {	// ��ŷ ����Ʈ�� Ư�� ������ ũ�ų� ���ٸ� �Է°��� ������ i+1���� �ȴ�.
				rank = i + 1;
				break;
			}else {							// ��ŷ ����Ʈ�� Ư�� ������ ���� ��� ������ �Ѵܰ� ���߰� ���� ���� ���Ѵ�.
				rank++;
			}
		}
		
		if(rank <= p) {						//������ rank�� ��ŷ ����Ʈ�� �� �� �ִ� �����̸� rank�� ��� �ƴѰ�� -1 ���
			System.out.println(rank);
		}else {
			System.out.println(-1);
		}
	}

}
