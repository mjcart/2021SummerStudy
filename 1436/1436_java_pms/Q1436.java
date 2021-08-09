package q1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num = 0;
		int count = 0;
		
		while(count != n) {
			num++;
			if(istrue(num)) {	//해당 num에 666이 들어있다면 count++
				count++;
			}
		}
		
		System.out.println(num);

	}
	
	static boolean istrue(int num) {
		char[] arr = Integer.toString(num).toCharArray();
		
		for(int i = 0; i < arr.length; i++) {		// 해당 숫자를 문자 배열로 집어넣고 연속되는 6이 3번 나오는지 확인
			if(i != 0 && i != arr.length -1 && arr[i] == '6' && arr[i-1] == '6' && arr[i+1] == '6') {
				return true;
			}
		}
		return false;
	}

}
