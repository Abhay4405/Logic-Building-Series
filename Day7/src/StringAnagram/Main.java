package StringAnagram;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	String s1 = "anish";
	String s2 = "nisha";
	char[] a1 = s1.toCharArray();
	char[] a2 = s2.toCharArray();
	for (int i = 0; i < a2.length; i++) {
		for (int j = 0; j < a2.length-1; j++) {
			if (a1[j] > a1[j+1]) {
				char temp = a1[j+1];
				a1[j+1] = a1[j];
				a1[j] = temp;
			}
			if (a2[j] > a2[j+1]) {
				char temp = a2[j+1];
				a2[j+1] = a2[j];
				a2[j] = temp;
			}
		}
	}
	boolean isAna = true;
	for (int i = 0; i < a2.length; i++) {
		if (a1[i] == a2[i]) {
			isAna = true;
		} else {
			isAna = false;
		}
	}
	if (isAna) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
}
}
