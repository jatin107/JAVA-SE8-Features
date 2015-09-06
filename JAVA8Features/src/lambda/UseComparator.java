package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator
{

	public static void main(String[] args)
	{

		List<String> strings = new ArrayList<String>();
		strings.add("jatin");
		strings.add("Nitin");
		strings.add("komal");
		strings.add("deepak");
		strings.add("sagar");
		// simple use of collection's sort() example ABCabc
		Collections.sort(strings);
		System.out.println("Sorted Strings");

		System.out.println(strings);
		Collections.sort(strings, (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		});
		System.out.println(strings);
		// using simople Comparator() in reverse order example CcBbAa
		Collections.sort(strings, new Comparator<String>()
		{
			@Override
			public int compare(String s1, String s2)
			{
				return s2.compareToIgnoreCase(s1);
			}
		});
		System.out.println(strings);

	}
}
