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
		int l = Integer.parseInt(st.nextToken());	//1m^2당 사람의 수
		int p = Integer.parseInt(st.nextToken());	//파티장 넓이
		int realpeople = l * p;	//실제 참가자 수 
		
		ArrayList<Integer> newspeople = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) { //신문 5개의 참가자 수를 ArrayList에 입력
			newspeople.add(Integer.parseInt(sk.nextToken()));
		}	

		
		for (int i : newspeople) {	//각 신문과 실제 참가자의 차이를 출력
			System.out.print(i - realpeople + " ");
		}
		
		
		
		

	}

}
