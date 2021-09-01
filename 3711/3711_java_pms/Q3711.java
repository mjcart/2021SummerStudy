package q3711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q3711 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// test case의 개수

		for(int k = 0; k < n; k++) {	
			
			int g = Integer.parseInt(br.readLine());	// 학생 수 입력
			int[] arr = new int[g];						// 각 학생의 학번을 저장할 배열 생성
			for(int i = 0; i < g; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int m = 0;									// 답 m 을 찾을 변수 선언
			while(true) {
				m++;
				boolean istrue = true;					// 현재 m 이 모든 학번을 나눈 나머지가 각각 다른지 판단
				ArrayList<Integer> modlist = new ArrayList<Integer>();	// 학번을 m으로 나눈 나머지를 저장할 리스트
				for(int i = 0; i < g; i++) {			// 모든 학번을 순회하며 m으로 나눔
					if(modlist.contains(arr[i] % m)) {	// m으로 나눈 나머지가 이미 나온 값인지 판단
						istrue = false;
						break;
					}
					modlist.add(arr[i] % m);
				}
				if(istrue == true) {
					System.out.println(m);
					break;
				}
			}
		}
	}

}
