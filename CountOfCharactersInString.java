package com.demo;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfCharactersInString {

	public static void main (String [] args) {
		String s1="anusha";
	
		Map<Character, Long> charCountMap =	s1.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		System.out.println(charCountMap);
	}
}
