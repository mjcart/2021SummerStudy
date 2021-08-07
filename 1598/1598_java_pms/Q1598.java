package q1598;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1598 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int x1, x2, y1, y2;	
		
		if (num1 % 4 == 0) {	// 4�� ���� �������� 0�̸� �ش� ������ �ε��� ��ȣ�� 3, num / 4 -1
			x1 = 3;
			y1 = num1 / 4 - 1;
		}else {					// �ƴϸ� num % 4 - 1, num / 4
			x1 = num1 % 4 - 1;
			y1 = num1 / 4;
		}
		
		if (num2 % 4 == 0) {
			x2 = 3;
			y2 = num2 / 4 - 1;
		}else {
			x2 = num2 % 4 - 1;
			y2 = num2 / 4;
		}

		int result = 0;
		if(x1 > x2) {	// �� ���� �ε��� ��ȣ �� ū ������ ���� ���� ���� �� ���� ���Ͽ� ���Ѵ�. 
			result += x1 - x2;
		}else {
			result += x2 - x1;
		}
		
		if(y1 > y2) {
			result += y1 - y2;
		}else {
			result += y2 - y1;
		}
		System.out.println(result);
		

	}

}