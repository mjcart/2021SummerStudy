package q3711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q3711 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// test case�� ����

		for(int k = 0; k < n; k++) {	
			
			int g = Integer.parseInt(br.readLine());	// �л� �� �Է�
			int[] arr = new int[g];						// �� �л��� �й��� ������ �迭 ����
			for(int i = 0; i < g; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int m = 0;									// �� m �� ã�� ���� ����
			while(true) {
				m++;
				boolean istrue = true;					// ���� m �� ��� �й��� ���� �������� ���� �ٸ��� �Ǵ�
				ArrayList<Integer> modlist = new ArrayList<Integer>();	// �й��� m���� ���� �������� ������ ����Ʈ
				for(int i = 0; i < g; i++) {			// ��� �й��� ��ȸ�ϸ� m���� ����
					if(modlist.contains(arr[i] % m)) {	// m���� ���� �������� �̹� ���� ������ �Ǵ�
						istrue = false;
						break;
					}
					modlist.add(arr[i] % m);
				}
				if(istrue == true) {
					System.out.println(m);
					break;
				}
			}
		}
	}

}
