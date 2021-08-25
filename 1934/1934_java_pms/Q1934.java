package q1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1 > num2) {	// num1�� ���� �� num2 �� ū ���� ������ �Ѵ�. 
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			int savenum2 =  num2;	// num2�� ���� �����ص� 
			
			while(true) {			// num2 �� num1�� ����̸� ���� , �ƴ϶�� ���� num2 �� ���� num2�� ������ 
				if(num2 % num1 == 0) {
					break;
				}else {
					num2 += savenum2;
				}
			}
			
			System.out.println(num2);
		}
		
	}

}
