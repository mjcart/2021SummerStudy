package q1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] num = {0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case '0':
				num[0]++;
				break;
			case '1':
				num[1]++;
				break;
			case '2':
				num[2]++;
				break;
			case '3':
				num[3]++;
				break;
			case '4':
				num[4]++;
				break;
			case '5':
				num[5]++;
				break;
			case '6':
				num[6]++;
				break;
			case '7':
				num[7]++;
				break;
			case '8':
				num[8]++;
				break;
			case '9':
				num[6]++;
				break;
			}
		}
		
		if(num[6] % 2 == 0) {
			num[6] = num[6] / 2;
		}else {
			num[6] = num[6] / 2 + 1;
		}
		
		System.out.println(Arrays.stream(num).max().getAsInt());
	}

}
