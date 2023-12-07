package com.leetcode.string;

public class MergeStringsAlternately {

	public static String mergeAlternately(String word1, String word2) {

		int count = 0;

		int word1Length = word1.length();
		int word2Length = word2.length();

		String extra = "";
		String finalString = "";

		if (word1Length > word2Length) {
			count = word2Length;
			extra = word1.substring(word2Length, word1Length);
		} else if (word2Length > word1Length) {
			count = word1Length;
			extra = word2.substring(word1Length, word2Length);
		} else {
			count = word1Length;
		}

		System.out.println("extra==>" + extra);

		for (int i = 0; i < count; i++) {
			finalString = finalString + word1.charAt(i);
			finalString = finalString + word2.charAt(i);
		}

		finalString = finalString + extra;

		return finalString;

	}

	public static void main(String[] args) {

		String finalS = mergeAlternately("abcd", "efgh");

	}

}
