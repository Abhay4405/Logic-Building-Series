package ReverseAnString;

public class Main {
public static void main(String[] args) {
	String s = "hello";
	char[] ch = s.toCharArray();
	int index = 0;
	for (int i = ch.length-1; i >= 0 ; i--) {
		if (index < i) {
			char temp = ch[i];
			ch[i] = ch[index];
			ch[index] = temp;
		}
		index++;
	}
	System.out.println(new String(ch));
}
}
