package q2845;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();	 
		String a = bf.readLine();	
		StringTokenizer st = new StringTokenizer(s);
		StringTokenizer sk = new StringTokenizer(a);
		int l = Integer.parseInt(st.nextToken());	//1m^2�� ����� ��
		int p = Integer.parseInt(st.nextToken());	//��Ƽ�� ����
		int realpeople = l * p;	//���� ������ �� 
		
		ArrayList<Integer> newspeople = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) { //�Ź� 5���� ������ ���� ArrayList�� �Է�
			newspeople.add(Integer.parseInt(sk.nextToken()));
		}	

		
		for (int i : newspeople) {	//�� �Ź��� ���� �������� ���̸� ���
			System.out.print(i - realpeople + " ");
		}
		
		
		
		

	}

}
