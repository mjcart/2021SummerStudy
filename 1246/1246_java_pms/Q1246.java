package q1246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1246 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 달걀의 수 
		int m = Integer.parseInt(st.nextToken());	// 잠재 고객의 수 
		
		ArrayList<Integer> client = new ArrayList<Integer>(); 	// 각 잠재 고객의 희망 가격을 저장할 리스트
		for(int i = 0; i < m; i++) {
			client.add(Integer.parseInt(br.readLine()));	
		}
		int maxsum = 0;
		int maxPi = 0;
		
		Collections.sort(client);	// 잠재 고객의 희망 가격을 오름차순 정렬
		
		for(int i = 0; i < client.size(); i++) {	// 각 잠재 고객의 희망가격으로 판매시 수익을 비교하여 최대 값을 구함
			int nowPi = client.get(i);
			int nowsum = 0;
			
			if (m - i < n) {	// 구매 가능한 잠재고객의 수가 달걀의 수보다 많을 경우는 최대 달걀의 수만큼만 구매한 것으로 계산
				nowsum = nowPi * (m - i);
			}else {
				nowsum = nowPi * n;
			}
			
			if(nowsum > maxsum) {
				maxsum = nowsum;
				maxPi = nowPi;
			}
		}
		System.out.println(maxPi + " " + maxsum);

	}

}
