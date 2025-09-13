package Concatinate2String;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char[] s1 = { 'a', 'b' };
		char[] s2 = { 'h', 'a', 'y' };
		char[] s3 = new char[s1.length + s2.length];
		for (int i = 0; i < s1.length; i++) {
			s3[i] = s1[i];
		}
		for (int i = 0; i < s2.length; i++) {
			s3[s1.length + i] = s2[i];
		}
		System.out.println(Arrays.toString(s3));
	}
}
