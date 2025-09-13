package SplitAString;

import java.util.Arrays;

public class Main {
	public static int count(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "abhay dubey from viva college";
		String[] arr = new String[count(s)];
		int index = 0;
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && i != s.length() - 1) {
				n = n + s.charAt(i);
			} else if (i == s.length() - 1) {
				n = n + s.charAt(i);
				arr[index] = n;
				index++;
				n = "";
			} else {
				arr[index] = n;
				index++;
				n = "";
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
