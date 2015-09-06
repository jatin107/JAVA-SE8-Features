package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//use of Interface Iterable<T> with forEach(Consumer<? super T> action) and iterator()   
public class TraverseCollection
{

	public static void main(String[] args)
	{
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("aa");
		strings.add("BBB");
		strings.add("bbbb");
		strings.add("CC");
		Collections.sort(strings);
		// Simple Sort and Traverse
		System.out.println("Simple Sort and Traverse");
		for (String str : strings)
			System.out.print(str);
		System.out.println();
		Collections.sort(strings, (s1, s2) -> {
			return s1.compareToIgnoreCase(s2);
		});
		// use of simple Iterator
		Iterator<String> i = strings.iterator();
		while (i.hasNext())
		{
			System.out.print(i.next());

		}
		// use of Foreach uses accept method of Consumer interface
		System.out.println("\nUse of Foreach");
		strings.forEach(str -> System.out.print(str));
	}
}
