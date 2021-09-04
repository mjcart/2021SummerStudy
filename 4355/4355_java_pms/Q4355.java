package q4355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q4355 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		ArrayList<Integer> high = new ArrayList<Integer>();
		ArrayList<Integer> low = new ArrayList<Integer>();
		int right = 0;
		
			while(true) {
				int num = Integer.parseInt(br.readLine());
				if(num == 0) {	// 0�� �ԷµǸ� ����
					return;
				}
				String isright = br.readLine();
				
				if(isright.charAt(4) == 'h') {	// ���� ���ڰ� high�� ���
					high.add(num);
				}else if(isright.charAt(4) == 'l') {	// ���� ���ڰ� low�� ���
					low.add(num);
				}else {						// ���� ���ڰ� right�� ���
					right = num;
					break;
				}
			}
			boolean istrue = true;
			for(int i = 0; i < high.size(); i++) {	// high�� ����� ��� ������ ���亸�� ū�� Ȯ�� 
				if(right >= high.get(i)) {
					istrue = false;
					break;
				}
			}
			if(istrue) {
				for(int i = 0; i < low.size(); i++) {	// low�� ����� ��� ������ ���亸�� ������ Ȯ��
					if(right <= low.get(i)) {
						istrue = false;
						break;
					}
				}
			}
			if(istrue) {
				System.out.println("Stan may be honest");
			}else {
				System.out.println("Stan is dishonest");
			}

		}
	}

}
