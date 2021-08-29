package q2204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {	// 0이 입력된 경우 프로그램 종료
				break;
			}
			
			ArrayList<String> list = new ArrayList<String>();	// 입력받은 단어들을 저장해둘 리스트
			ArrayList<Integer> ranklist = new ArrayList<Integer>();	// 입력받은 단어들의 사전상 순위를 저장할 리스트
			
			for(int i = 0; i < n; i++) {	// 단어들을 입력받아 리스트에 저장 
				list.add(br.readLine());
			}
			
			for(int i = 0; i < n; i++) {	// 리스트에 저장된 단어들을 순차적으로 하나씩 선택
				int rank = 1;				// 선택된 단어가 리스트에 있는 모든 단어들 중 몇번째 순위인지 체크하는 변수
				for(int j = 0; j < n; j++) {// 선택된 단어를 리스트의 다른 모든 단어와 비교
					if(list.get(i).toLowerCase().compareTo(list.get(j).toLowerCase()) > 0) {	// 선택된 단어와 리스트의 모든 단어들을 전부 소문자로 만들고 비교하여 선택된 단어보다 사전순으로 앞서는 단어가 나올 경우 rank +1
						rank++;
					}
				}
				ranklist.add(rank);			// 각 인덱스의 단어마다 구해진 순위를 ranklist에 저장
			}
			int resindex = ranklist.indexOf(1);	// 순위가 가장 앞서는 1위인 단어의 인덱스 번호를 가져옴 
			System.out.println(list.get(resindex));	// 순위가 가장 앞서는 인덱스 번호의 단어를 list에서 출력
		}
		

	}

}
