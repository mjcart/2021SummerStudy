package q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		boolean group = true;
		int prev = 0;	//이전 문자
		int count = 0;	// 그룹 단어 수 
		
		for(int i = 0; i < n; i++) {
			String s = bf.readLine();
			group = true;	//그룹 단어인지 판별 
			ArrayList<Integer> chkstr = new ArrayList<Integer>(); //기존에 나온 적 있는 문자인지 확인하기 위한 리스트
			prev = 0;
			
			for(int j = 0; j < s.length(); j++) {	//단어의 첫 문자부터 끝 문자까지 순회
				int now = s.charAt(j);
				
				if(prev != now) {	//현재 문자와 이전 문자가 같지 않을 경우(연속되지 않은 새로운 문자가 나왔을 때)
					if(chkstr.contains(now)) {	// 해당 문자가 기존에 나온 적 있는 문자인지 확인
						group = false;	// 나온 적 있다면 해당 단어는 그룹 단어가 아님 
						break;
					}
					chkstr.add(now);	// 나온 적 없다면 리스트에 해당 단어 추가하고 다음 단어로 넘어감 
					prev = now;
				}	
			}
			
			
			if(group) {
				count++;
			}
		}
		System.out.println(count);

	}

}
