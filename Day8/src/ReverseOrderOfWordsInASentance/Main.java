package ReverseOrderOfWordsInASentance;

import java.util.Arrays;

public class Main {

	public void reverse(char[] ch , int i , int j) {
		while(i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		String s = "Abhay Chhabinath Dubey";
		char[] sArray = s.toCharArray();
		Main o = new Main();
		o.reverse(sArray, 0, sArray.length-1);
		int start = 0;
		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] == ' ') {
				o.reverse(sArray, start, i-1);
				start = i+1;
			}else if (i == sArray.length-1) {
				o.reverse(sArray, start, i);
			}
		}
	    System.out.println(new String(sArray));
	}
}
