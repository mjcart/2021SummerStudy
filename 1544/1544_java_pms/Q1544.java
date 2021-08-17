package q1544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1544 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<String>();	// ���ο� ���ڰ� �ԷµǸ� ������ ����Ʈ ����
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			boolean isequal = false; 
			
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).length() == word.length()) {	// ����Ǿ� �ִ� �ܾ�� �� ���� �Է´ܾ�� ���� ���� �Ȱ����͵鸸 �� 
					if(compare(list.get(j), word)) {
						isequal = true;
						break;
					}
				}
				
			}
			if(isequal == false) {	// ������ �ִ� ���ڰ� �ƴѰ����� �������� ����Ʈ�� �߰���Ŵ
				list.add(word);
			}
		}
		System.out.println(list.size());	// ����Ʈ�� ����� ���ڵ��� �����̹Ƿ� ��½�����
	}
	
	public static boolean compare(String s, String w) {
		boolean equal = false;
		StringBuffer sb = new StringBuffer();

		sb.append(s);
		for(int i = 0; i < s.length(); i++) {
			equal = true;
			for(int j = 0; j < s.length(); j++) {	// �ش� �� �ܾ��� ��� ���ڰ� �Ȱ����� Ȯ��
				if(sb.toString().charAt(j) == w.charAt(j)) {
					
				}else {
					equal = false;
				}
			}
			if(equal) {	// ���� �ٸ� ���ڰ� �ϳ��� �ִٸ� false�̹Ƿ� ��� ����
				break;
			}
			sb = sb.append(sb.charAt(0)).deleteCharAt(0);	// �񱳴�� �ܾ��� �� �ձ��ڸ� �� �ڿ� �Űܺ���
		}
		
		return equal;
	}

}
