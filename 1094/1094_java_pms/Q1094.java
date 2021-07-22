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
			for(int i : stickList) // 막대들의 총 합 
			    sum += i;
			
			if(sum <= x) { // 막대들의 총 합이 x보다 작거나 같으면 종료
				System.out.println(stickList.size());
				return;
			}

			int stick = stickList.get(stickList.size()-1); // 가장 작은 길이의 막대를 절반으로 자르기 위해 리스트에서 가져옴
			stickList.remove(stickList.size()-1); 
			
			if((stick/2 + sum-stick) >= x) {	// 자른 막대의 절반 중 하나를 버리고 남아있는 막대의 길이의 합이 x보다 크거나 같다면 막대의 절반 중 하나를 버린다.
				stickList.add(stick/2);
			}else {
				stickList.add(stick/2);
				stickList.add(stick/2);
			}
				
		}
		
		

	}

}
