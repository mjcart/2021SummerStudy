package q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		boolean group = true;
		int prev = 0;	//���� ����
		int count = 0;	// �׷� �ܾ� �� 
		
		for(int i = 0; i < n; i++) {
			String s = bf.readLine();
			group = true;	//�׷� �ܾ����� �Ǻ� 
			ArrayList<Integer> chkstr = new ArrayList<Integer>(); //������ ���� �� �ִ� �������� Ȯ���ϱ� ���� ����Ʈ
			prev = 0;
			
			for(int j = 0; j < s.length(); j++) {	//�ܾ��� ù ���ں��� �� ���ڱ��� ��ȸ
				int now = s.charAt(j);
				
				if(prev != now) {	//���� ���ڿ� ���� ���ڰ� ���� ���� ���(���ӵ��� ���� ���ο� ���ڰ� ������ ��)
					if(chkstr.contains(now)) {	// �ش� ���ڰ� ������ ���� �� �ִ� �������� Ȯ��
						group = false;	// ���� �� �ִٸ� �ش� �ܾ�� �׷� �ܾ �ƴ� 
						break;
					}
					chkstr.add(now);	// ���� �� ���ٸ� ����Ʈ�� �ش� �ܾ� �߰��ϰ� ���� �ܾ�� �Ѿ 
					prev = now;
				}	
			}
			
			
			if(group) {
				count++;
			}
		}
		System.out.println(count);

	}

}
