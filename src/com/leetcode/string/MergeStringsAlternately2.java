package com.leetcode.string;

public class MergeStringsAlternately2 {

	public static String mergeAlternately(String word1, String word2) {

		int count = 0;

		int word1Length = word1.length();
		int word2Length = word2.length();

		StringBuilder extra = new StringBuilder();
		StringBuilder finalString = new StringBuilder();

		if (word1Length > word2Length) {
			count = word2Length;
			extra.append(word1.substring(word2Length, word1Length));
		} else if (word2Length > word1Length) {
			count = word1Length;
			extra.append(word2.substring(word1Length, word2Length));
		} else {
			count = word1Length;
		}

		System.out.println("extra==>" + extra);

		for (int i = 0; i < count; i++) {
			finalString.append(word1.charAt(i));
			finalString.append(word2.charAt(i));
		}

		finalString.append(extra);

		return finalString.toString();

	}

	public static void main(String[] args) {

		String finalS = mergeAlternately("abcd", "efgh");

		System.out.println("finalS====>" + finalS);

	}

}
