package q4355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q4355 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		ArrayList<Integer> high = new ArrayList<Integer>();
		ArrayList<Integer> low = new ArrayList<Integer>();
		int right = 0;
		
			while(true) {
				int num = Integer.parseInt(br.readLine());
				if(num == 0) {	// 0이 입력되면 종료
					return;
				}
				String isright = br.readLine();
				
				if(isright.charAt(4) == 'h') {	// 현재 숫자가 high인 경우
					high.add(num);
				}else if(isright.charAt(4) == 'l') {	// 현재 숫자가 low인 경우
					low.add(num);
				}else {						// 현재 숫자가 right인 경우
					right = num;
					break;
				}
			}
			boolean istrue = true;
			for(int i = 0; i < high.size(); i++) {	// high에 저장된 모든 값들이 정답보다 큰지 확인 
				if(right >= high.get(i)) {
					istrue = false;
					break;
				}
			}
			if(istrue) {
				for(int i = 0; i < low.size(); i++) {	// low에 저장된 모든 값들이 정답보다 작은지 확인
					if(right <= low.get(i)) {
						istrue = false;
						break;
					}
				}
			}
			if(istrue) {
				System.out.println("Stan may be honest");
			}else {
				System.out.println("Stan is dishonest");
			}

		}
	}

}
