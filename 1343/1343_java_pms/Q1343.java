package q1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1343 {
	static String output = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char[] input = st.toCharArray();	// �Է°��� �迭�� ����
		
		int cnt = 0;
		char now;
		
		for(int i  = 0; i < input.length; i++) {	// �Է°� �迭���� �� char �� ��ȸ
			now = input[i];
			if (now == 'X') {	// ���� ���� X�� ���
				cnt++;	// ������ X�� ������ ������Ű�� ����
			}
			if (now == '.') {	// ���� ���� .�ΰ�� �������� ������ X�� ������ Ȧ���� -1 ��� ���� ¦���� ��� process �Լ��� ���� 
				if(cnt % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(cnt);

				output = output + ".";	// X�� ���� AAAA, BB�� ��ü�Ͽ� �߰��� �ڿ� ���� ���� . �� ��� ���ڿ��� �߰������� 
				
				cnt = 0;	// ���ݱ��� ������ X�� AAAA, BB�� ��ü�Ͽ� �߰��Ͽ����Ƿ� cnt�� �ʱ�ȭ�� ���� X ���� ���� 
			}
			if(i == input.length -1) {	// ���� index��ġ�� �Է°��� �������� ��� �����ִ� cnt����ŭ�� ����ؾ��ϹǷ� Ȧ������ Ȯ���ϰ� process �Լ��� ����
				
				if(cnt % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(cnt);
				cnt = 0;
			}

		}
		System.out.println(output);
	}
	static void process(int n) {	// �߰��� ä�����ϴ� X�� ������ �־����� AAAA�� �̿��Ͽ� ��� ���ڿ��� �ִ��� ä�� �� ������ ����ŭ BB�� �̿��Ͽ� ä�� 

		int a = n / 4;
		int b = (n % 4) / 2;
		for(int j = 0; j < a; j++) {
			output = output + "AAAA";
		}
		for(int j = 0; j < b; j++) {
			output = output + "BB";
		}

	}

}
