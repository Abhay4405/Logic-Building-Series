package PrintRepetativeCharactersInAString;

public class Main {
    public static void main(String[] args) {
        String s = "hello world";
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0 ) {
                continue;  // Ignore already visited characters and spaces
            }
            
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = 0;  // Mark as visited
                }
            }
            
            if (count > 1) {
                System.out.println(ch[i] + " is repeated " + count + " times.");
            }
        }
    }
}
