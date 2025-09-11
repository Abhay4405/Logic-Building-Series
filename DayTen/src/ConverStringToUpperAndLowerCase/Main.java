package ConverStringToUpperAndLowerCase;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	String s1 = "abhay"; //ToUpperCase
	String s2 = "ABHAY"; //ToLowerCase
	char[] ch1 = s1.toCharArray();
	char[] ch2 = s2.toCharArray();
	for (int i = 0; i < ch1.length; i++) {
		if (ch1[i]>='a' && ch1[i]<='z') {
			int num = ch1[i];
			num = num-32;
			ch1[i] = (char) num;
		}
	}
	for (int i = 0; i < ch1.length; i++) {
		if (ch1[i]>='A' && ch1[i]<='Z') {
			int num = ch1[i];
			num = num+32;
			ch2[i] = (char) num;
		}
	}
	System.out.println(ch1);
	System.out.println(ch2);
}
}
