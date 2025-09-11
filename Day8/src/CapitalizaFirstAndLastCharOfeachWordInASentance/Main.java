package CapitalizaFirstAndLastCharOfeachWordInASentance;

import java.util.Arrays;

public class Main {
	public char UpparCase(char ch) {
		if (ch>='a' && ch<='z') {
			int num = ch;
			ch = (char) (num-32); //TypeCasting
		}
		return ch;
	}
public static void main(String[] args) {
	String s = "hello abhay here";
	char[] arr = s.toCharArray();
	Main o = new Main();
	for (int i = 0; i < arr.length; i++) {
		if (i == 0 || i == arr.length-1) {
			arr[i] = o.UpparCase(arr[i]);
		}else if (arr[i] == ' ') {
			arr[i-1] = o.UpparCase(arr[i-1]);
			arr[i+1] = o.UpparCase(arr[i+1]);
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
