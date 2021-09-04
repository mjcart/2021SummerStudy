package q5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int korworkday = a/c;
		int mathworkday = b/d;
		if(a%c != 0 )
			korworkday++;
		if(b%d != 0)
			mathworkday++;
		int workday = Math.max(korworkday, mathworkday);
		System.out.println(l-workday);
		
	}

}
