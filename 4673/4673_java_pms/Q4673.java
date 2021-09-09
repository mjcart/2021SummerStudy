package q4673;

public class Q4673 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			boolean isSelf = true;
			for(int j = i/2; j < i; j++) {
				if(j + j / 1000 + (j % 1000) / 100 + (j % 100) / 10 + j % 10 == i) {
					isSelf = false;
					break;
				}
			}
			if(isSelf) {
				System.out.println(i);
			}
		}

	}

}
