package com.leetcode.string;

import java.util.HashMap;

public class RomanToInteger {

	public int romanToInt(String s) {

		int sum = 0;
		int prevValue = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int currentValue = getValue(s, i);

			if (prevValue != 0 && currentValue < prevValue) {
				sum = sum - currentValue;
			} else {
				sum = sum + currentValue;
			}
			prevValue = currentValue;
		}
		return sum;
	}

	public int getValue(String s, int i) {

		HashMap<String, Integer> haspMap = new HashMap<String, Integer>();
		haspMap.put("I", 1);
		haspMap.put("V", 5);
		haspMap.put("X", 10);
		haspMap.put("L", 50);
		haspMap.put("C", 100);
		haspMap.put("D", 500);
		haspMap.put("M", 1000);

		return haspMap.get(String.valueOf(s.charAt(i)));
	}
}
