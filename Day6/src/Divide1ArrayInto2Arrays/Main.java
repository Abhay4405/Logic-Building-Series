package Divide1ArrayInto2Arrays;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] a1 = {1,2,3,4};
	int[] a2 = new int[a1.length/2];
	int[] a3 = new int[a1.length/2];
	int index = 0;
	for (int i = 0; i < a1.length/2; i++) {
		a2[i] = a1[i]; 
	}
	for (int i = (a1.length/2); i < a1.length; i++) {
		a3[index] = a1[i]; 
		index++;
	}
	System.out.println(Arrays.toString(a2));
	System.out.println(Arrays.toString(a3));
}
}
