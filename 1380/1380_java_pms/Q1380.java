package q1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1380 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sce = 0;	// �� ��° �ó��������� ǥ��
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {	// 0 �Է½� ����
				return;
			}else {
				sce++;
			}
			
			ArrayList<String> girls = new ArrayList<String>();	// �Է¹��� ���л����� ������� �����ص� �迭
			
			for(int i = 0; i < n; i++) {	// ���л��� �̸� n �� �Է� 
				girls.add(br.readLine());
			}
			
			ArrayList<Integer> isNum = new ArrayList<Integer>();	// �Է¹��� ���ڸ� �����ϴ� ����Ʈ
			for(int i = 0; i < n*2-1; i++ ) {	// ���л����� �Ͱ����� �̵��� ��Ÿ���� �Է� n*2 -1ȸ 
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken());	// �Է� �� A,B�� ���� �л��� ��ȣ�� ��Ÿ���� �� �� ���ڸ� �Է� 
				
				if (isNum.contains(num)) {	// ���� ���� �� �� �ԷµǸ� �Ͱ��̴� �ǵ������� ���̹Ƿ� �ش� ���ڰ� ����Ʈ�� �ִ��� Ȯ��
					isNum.remove((Integer)num);	// ����Ʈ�� �ִٸ� �Ͱ��̸� �ǵ����޾����Ƿ� ����Ʈ���� �ش� �� ���� 
				}else {
					isNum.add(num);	// ����Ʈ�� ���ٸ� ó�� �Էµ� ������ �ش� ���ڸ� ����Ʈ�� �߰����� 
				}
			}
			
			int resultgirl = isNum.get(0);	// �Ͱ��̸� �ǵ������� ���� �л��� isNum ����Ʈ�� �����ִ� ��ȣ�� �л��� 
			System.out.println(sce + " " + girls.get(resultgirl-1));	// �ó����� ��ȣ�� �Ͱ��̸� �������� ���� �л� ���  
		}

	}

}
