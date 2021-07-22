package q1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		ArrayList<Integer> stickList = new ArrayList<Integer>();
		stickList.add(64);
		
		while(true) {
			int sum = 0;
			for(int i : stickList) // ������� �� �� 
			    sum += i;
			
			if(sum <= x) { // ������� �� ���� x���� �۰ų� ������ ����
				System.out.println(stickList.size());
				return;
			}

			int stick = stickList.get(stickList.size()-1); // ���� ���� ������ ���븦 �������� �ڸ��� ���� ����Ʈ���� ������
			stickList.remove(stickList.size()-1); 
			
			if((stick/2 + sum-stick) >= x) {	// �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� x���� ũ�ų� ���ٸ� ������ ���� �� �ϳ��� ������.
				stickList.add(stick/2);
			}else {
				stickList.add(stick/2);
				stickList.add(stick/2);
			}
				
		}
		
		

	}

}
