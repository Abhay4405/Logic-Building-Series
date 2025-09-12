package CheckIfStringIsPallindromeUsingRecursion;

public class Main {
	public static boolean isPallin(String s,int i,int j) {
		if (i>j) {
			return true;
		}
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		return isPallin(s, i+1, j-1);
	}
public static void main(String[] args) {
	if (isPallin("poiiop",0,5)) {
		System.out.println("Pallindrome");
	}else {
		System.out.println("not a pallindrome");
	}
}
}
