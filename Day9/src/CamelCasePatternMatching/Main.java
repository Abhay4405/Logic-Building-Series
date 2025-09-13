package CamelCasePatternMatching;

public class Main {
	public static void main(String[] args) {
		String s = "abhayDubey";
		if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
			boolean isCamel = false;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					isCamel = true;
					break;
				}
			}
			if (isCamel) {
				System.out.println("In Camel Case");
			} else {
				System.out.println("Not in Camel Case");
			}
		} else {
			System.out.println("Not in Camel Case");
		}
	}
}
