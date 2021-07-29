package q1343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1343 {
	static String output = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char[] input = st.toCharArray();	// 입력값을 배열에 저장
		
		int cnt = 0;
		char now;
		
		for(int i  = 0; i < input.length; i++) {	// 입력값 배열에서 한 char 씩 순회
			now = input[i];
			if (now == 'X') {	// 현재 값이 X인 경우
				cnt++;	// 지나온 X의 개수를 누적시키는 변수
			}
			if (now == '.') {	// 현재 값이 .인경우 그전까지 누적된 X의 개수가 홀수면 -1 찍고 종료 짝수인 경우 process 함수에 돌림 
				if(cnt % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(cnt);

				output = output + ".";	// X의 값을 AAAA, BB로 대체하여 추가한 뒤에 현재 값인 . 도 출력 문자열에 추가시켜줌 
				
				cnt = 0;	// 지금까지 누적된 X를 AAAA, BB로 대체하여 추가하였으므로 cnt를 초기화해 새로 X 누적 시작 
			}
			if(i == input.length -1) {	// 현재 index위치가 입력값의 마지막인 경우 남아있는 cnt값만큼을 출력해야하므로 홀수인지 확인하고 process 함수에 돌림
				
				if(cnt % 2 != 0) {
					System.out.println("-1");
					return;
				}
				process(cnt);
				cnt = 0;
			}

		}
		System.out.println(output);
	}
	static void process(int n) {	// 중간에 채워야하는 X의 개수가 주어지면 AAAA를 이용하여 출력 문자열에 최대한 채운 뒤 나머지 수만큼 BB를 이용하여 채움 

		int a = n / 4;
		int b = (n % 4) / 2;
		for(int j = 0; j < a; j++) {
			output = output + "AAAA";
		}
		for(int j = 0; j < b; j++) {
			output = output + "BB";
		}

	}

}
