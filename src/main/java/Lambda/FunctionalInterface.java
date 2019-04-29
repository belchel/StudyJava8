package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalInterface {
	
	public static void main(String[] args) {		
		Multi m = (x,y) -> {return x*y;};
		System.out.println(m.multiply(3,2));		
		
		List<Integer> numbers= Arrays.asList(1,2,3,4,4,6,6);
		Stream<Integer> maps= numbers.stream().map(i->i*i);
		maps.mapToInt((x)->x).forEach(x->System.out.print(x+" "));
		System.out.println("");
		numbers.stream().map(i->i*i).mapToInt((x)->x).distinct().forEach(x->System.out.print(x+" "));
		System.out.println("");
		int sum = numbers.stream().map(i->i*i).distinct().mapToInt((x)->x).sum();
		System.out.println(sum);		
				
	}
	
	interface Multi{
		public int multiply(int p, int i);
	}
}
