package q1267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ysum = 0, msum = 0;		// 전체 통화 합산 요금

		
		for(int i = 0; i < n; i++) {
			int time = Integer.parseInt(st.nextToken());
			int y, m;				//이번 통화의 요금 
			
			// Y요금제일 경우 금액 계산 
			y = time/30 + 1;
			
			ysum += y * 10;
			
			// M요금제일 경우 금액 계산
			m = time/60 + 1;

			msum += m * 15;	
		}
		
		if(ysum == msum) {
			System.out.println("Y M " + ysum);
		}else if(ysum > msum) {
			System.out.println("M " + msum);
		}else {
			System.out.println("Y " + ysum);
		}

	}

}
