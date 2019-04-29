package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		FlatMapping();
	}
	public static void FlatMapping() {
		
		List li1= Arrays.asList("A","B");
		List li2= Arrays.asList("C","D");
		
		Stream.of(li1,li2).flatMap(l-> l.stream()).forEach(s->System.out.print(s+" "));
	}
}
