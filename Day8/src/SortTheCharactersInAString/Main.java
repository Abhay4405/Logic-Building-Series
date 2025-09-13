package SortTheCharactersInAString;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		String s = "abhay";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
