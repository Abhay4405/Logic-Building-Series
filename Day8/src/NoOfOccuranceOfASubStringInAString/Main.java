package NoOfOccuranceOfASubStringInAString;

public class Main {
    public static void main(String[] args) {
        String str = "heellohelloe";
        String substr = "ello";
        int count = 0;

        for (int i = 0; i <= str.length() - substr.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                count++;
            }
        }

        System.out.println("Number of occurrences: " + count);
    }
}
