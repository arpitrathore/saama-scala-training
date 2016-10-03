package org.arpit.scala.training.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapJava {

	public static void main(String[] args) {
		List<String> keywords = Arrays.asList("BlackBerry", "Apple", "Avocado",
				"Mango", "Beet", "Banana");
		Map<Character, List<String>> result = new HashMap<Character, List<String>>();

		for (String k : keywords) {
			char firstChar = k.charAt(0);
			if (!result.containsKey(firstChar)) {
				result.put(firstChar, new ArrayList<String>());
			}
			result.get(firstChar).add(k);
		}

		for (List<String> list : result.values()) {
			Collections.sort(list);
		}

		System.out.println(result);
	}
}
