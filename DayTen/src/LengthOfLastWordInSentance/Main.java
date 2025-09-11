package LengthOfLastWordInSentance;

public class Main {
public static void main(String[] args) {
	String s = "Abhay studies in Viva Institute of Technology";
	int length = 0;
	for (int i = s.length()-1; i >= 0 ; i--) {
		if (s.charAt(i) == ' ') {
			break;
		}
		else {
			length++;
		}
	}
	System.out.println("Length of the last word in the String is: " + length);
}
}
