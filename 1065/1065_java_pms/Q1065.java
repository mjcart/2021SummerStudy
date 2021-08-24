package q1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int cnt = 0;
		for(int i = 1; i <= Integer.parseInt(n); i++) {
			Integer input = i;
			if(ishansu(input.toString())) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean ishansu(String s) {
		
		if(s.length() <= 2) {
			return true;
		}
		for(int i = 1; i < s.length()-1; i++) {
			if(s.charAt(i-1) - s.charAt(i) != (s.charAt(i) - s.charAt(i+1))) {
				return false;
			}
		}
		return true;
	}
}
