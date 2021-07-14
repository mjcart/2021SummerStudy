package q16170;

import java.time.LocalDateTime;

public class Q16170 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		now.minusHours(9);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());

	}

}
