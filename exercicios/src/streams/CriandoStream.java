package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> print2 = System.out::println;
		
		Stream<String> langs = Stream.of("Java ","Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1,2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ","PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		
		//Stream.generate(() ->"a")
		Stream.iterate(0, n -> n+1).forEach(print2);
		

	}

}
