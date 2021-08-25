package q1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1 > num2) {	// num1에 작은 수 num2 에 큰 수가 오도록 한다. 
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			int savenum2 =  num2;	// num2의 값을 저장해둠 
			
			while(true) {			// num2 가 num1의 배수이면 종료 , 아니라면 최초 num2 의 값을 num2에 더해줌 
				if(num2 % num1 == 0) {
					break;
				}else {
					num2 += savenum2;
				}
			}
			
			System.out.println(num2);
		}
		
	}

}
