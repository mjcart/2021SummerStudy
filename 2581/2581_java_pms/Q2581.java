package q2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		boolean[] arr = new boolean[n+1];
		arr[0] = arr[1] = false;
		for(int i=2; i<=n; i++) {
			arr[i] = true;
		}

		 for(int i=2; i*i<=n; i++) {
	            for(int j=i*i; j<=n; j+=i) {
	                arr[j] = false;        
	            }
	        }
		 
		ArrayList<Integer> list = new ArrayList<Integer>();	// m부터 n사이의 소수들을 저장해둘 리스트 생성
		for(int i = m; i <= n; i++) {
			if(arr[i]) {
				sum += i;
				list.add(i);
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(list.get(0));	//m부터 n사이의 소수들 중 가장 작은 수를 출력 
		}

	}

}
