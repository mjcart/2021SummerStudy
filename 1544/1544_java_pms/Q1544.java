package q1544;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1544 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<String>();	// 새로운 글자가 입력되면 저장할 리스트 생성
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			boolean isequal = false; 
			
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).length() == word.length()) {	// 저장되어 있는 단어들 중 현재 입력단어와 글자 수가 똑같은것들만 비교 
					if(compare(list.get(j), word)) {
						isequal = true;
						break;
					}
				}
				
			}
			if(isequal == false) {	// 기존에 있던 글자가 아닌것으로 정해지면 리스트에 추가시킴
				list.add(word);
			}
		}
		System.out.println(list.size());	// 리스트의 사이즈가 문자들의 종류이므로 출력시켜줌
	}
	
	public static boolean compare(String s, String w) {
		boolean equal = false;
		StringBuffer sb = new StringBuffer();

		sb.append(s);
		for(int i = 0; i < s.length(); i++) {
			equal = true;
			for(int j = 0; j < s.length(); j++) {	// 해당 두 단어의 모든 글자가 똑같은지 확인
				if(sb.toString().charAt(j) == w.charAt(j)) {
					
				}else {
					equal = false;
				}
			}
			if(equal) {	// 서로 다른 글자가 하나라도 있다면 false이므로 계속 진행
				break;
			}
			sb = sb.append(sb.charAt(0)).deleteCharAt(0);	// 비교대상 단어의 맨 앞글자를 맨 뒤에 옮겨붙임
		}
		
		return equal;
	}

}
