package Date;

import java.time.LocalDate;

public class Immutable {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.ofYearDay(2015, 2);
		System.out.println("antes:" + date);
		date.minusMonths(2);
		System.out.println("depois:" + date);

		LocalDate novadata =date.minusMonths(2);
		System.out.println("novoObj:" + novadata);
		
	}
}
