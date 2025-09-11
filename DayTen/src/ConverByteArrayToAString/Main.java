package ConverByteArrayToAString;

public class Main {
public static void main(String[] args) {
	byte[] by = {65,67,105,110};
	String s = " ";
	for (int i = 0; i < by.length; i++) {
		s = s + (char) by[i]; //Typecasting.
	}
	System.out.println(s);
}
}
