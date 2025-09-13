package StringPallindrome;

public class Main {
	public static void main(String[] args) {
		String s = "level";
		boolean isPallin = true;
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				isPallin = false;
			}
			i++;
			j--;
		}
		if (isPallin) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
