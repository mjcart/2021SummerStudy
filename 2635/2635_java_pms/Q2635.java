package q2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2635 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0; 
		ArrayList<Integer> maxlist = new ArrayList<Integer>();	// 최대 개수의 숫자 조합을 저장할 리스트
		
		for(int i = 1; i <= n; i++) {
			ArrayList<Integer> nowlist = new ArrayList<Integer>();	// 현재경우의 숫자 조합을 저장할 리스트
			nowlist.add(n);										// n을 리스트의 1번 i를 리스트의 2번에 저장해두고 계산 시작 
			nowlist.add(i);
			int prev1 = n;
			int prev2 = i;
			
			while(true) {										// 결과가 0보다 큰 동안 앞앞 숫자에서 앞 숫자를 빼준값을 리스트에 저장 
				int temp = prev1 - prev2;
				if(temp>=0) {
					nowlist.add(temp);
				}else {
					break;
				}
				prev1 = prev2;									// 앞앞 숫자와 앞 숫자를 새로 지정
				prev2 = temp;
			}
			if(max < nowlist.size()) {							// 이번 회차가 최대 개수의 숫자라면 해당 개수를 max에 저장하고 리스트의 숫자 조합을 maxlist에 저장
				max = nowlist.size();
				maxlist = nowlist;
			}
		}
		
		System.out.println(max);								// 최대 값과 그 조합을 출력
		for(int i = 0; i < maxlist.size(); i++) {
			System.out.print(maxlist.get(i) + " ");
		}

	}

}
