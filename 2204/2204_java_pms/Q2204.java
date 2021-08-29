package q2204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {	// 0�� �Էµ� ��� ���α׷� ����
				break;
			}
			
			ArrayList<String> list = new ArrayList<String>();	// �Է¹��� �ܾ���� �����ص� ����Ʈ
			ArrayList<Integer> ranklist = new ArrayList<Integer>();	// �Է¹��� �ܾ���� ������ ������ ������ ����Ʈ
			
			for(int i = 0; i < n; i++) {	// �ܾ���� �Է¹޾� ����Ʈ�� ���� 
				list.add(br.readLine());
			}
			
			for(int i = 0; i < n; i++) {	// ����Ʈ�� ����� �ܾ���� ���������� �ϳ��� ����
				int rank = 1;				// ���õ� �ܾ ����Ʈ�� �ִ� ��� �ܾ�� �� ���° �������� üũ�ϴ� ����
				for(int j = 0; j < n; j++) {// ���õ� �ܾ ����Ʈ�� �ٸ� ��� �ܾ�� ��
					if(list.get(i).toLowerCase().compareTo(list.get(j).toLowerCase()) > 0) {	// ���õ� �ܾ�� ����Ʈ�� ��� �ܾ���� ���� �ҹ��ڷ� ����� ���Ͽ� ���õ� �ܾ�� ���������� �ռ��� �ܾ ���� ��� rank +1
						rank++;
					}
				}
				ranklist.add(rank);			// �� �ε����� �ܾ�� ������ ������ ranklist�� ����
			}
			int resindex = ranklist.indexOf(1);	// ������ ���� �ռ��� 1���� �ܾ��� �ε��� ��ȣ�� ������ 
			System.out.println(list.get(resindex));	// ������ ���� �ռ��� �ε��� ��ȣ�� �ܾ list���� ���
		}
		

	}

}
