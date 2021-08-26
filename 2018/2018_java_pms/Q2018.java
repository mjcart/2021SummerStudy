package q2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = n; i > 0; i--) {	// n부터 1까지 자연수의 조합의 가장 큰 수를 하나씩 줄여가며 판단
			int sum = i;		// 해당 회차의 자연수의 합을 이용한 덧셈의 결과 저장
			int j = 1;			// 덧셈을 반복한 횟수를 저장하는 인덱스
			
			while(true) {		
				if(sum == n) {	// 자연수들의 합이 n과 같다면 cnt를 증가시키고 종료	
					cnt++;
					break;
				}else if(sum > n) {	// 자연수들의 합이 n보다 크다면 불가능한 회차이므로 종료
					break;
				}else if(j == i) {	// i 부터 0까지 모두 더해도 n의 값에 도달하지 못한다면 종료
					break;
				}
				sum += i-j;
				j++;
			}
		}
		System.out.println(cnt);

	}

}
