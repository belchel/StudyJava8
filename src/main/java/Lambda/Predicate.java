package Lambda;

import java.util.ArrayList;
import java.util.function.DoublePredicate;
import Model.Certification;

public class Predicate {

	public static void main(String[] args) {
		DoublePredicate();
		ObjectPredicate();
	}

	private static void DoublePredicate() {
		ArrayList<Double> list = new ArrayList<>();
		list.add(21.6);
		list.add(21.39);
		list.add(21.5d);
		list.add(21.41);
		list.add(21.33);

		DoublePredicate ip = i -> i > 21.4;

		for (Double d : list) {
			if (ip.test(d)) {
				System.out.println(d);
			}
		}
	}

	private static void ObjectPredicate() {
		ArrayList<Certification> list = new ArrayList<>();
		list.add(new Certification("XXX",120));
		list.add(new Certification("YYY",250));
		list.add(new Certification("ZZZ",175));
		list.add(new Certification("AAA",150));
		list.add(new Certification("BBB",225));
		
	
		Predicate<Certification> filter = (c)->{return c.getPrice() >150;};
		
		for(Certification c : list) {
			if(filter.test(c)) {
				System.out.println(c);
			}
		}
	}

}
