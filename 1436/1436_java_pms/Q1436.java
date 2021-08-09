package q1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		int count = 0;
		
		while(count != n) {
			num++;
			if(istrue(num)) {	//�ش� num�� 666�� ����ִٸ� count++
				count++;
			}
		}
		
		System.out.println(num);

	}
	
	static boolean istrue(int num) {
		char[] arr = Integer.toString(num).toCharArray();
		
		for(int i = 0; i < arr.length; i++) {		// �ش� ���ڸ� ���� �迭�� ����ְ� ���ӵǴ� 6�� 3�� �������� Ȯ��
			if(i != 0 && i != arr.length -1 && arr[i] == '6' && arr[i-1] == '6' && arr[i+1] == '6') {
				return true;
			}
		}
		return false;
	}

}
