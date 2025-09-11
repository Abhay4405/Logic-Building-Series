package BinaryToDecimal;

public class Main {
    public static void main(String[] args) {
        int bi = 11010;   
        int decNum = 0;
        int power = 1;

        while (bi != 0) {
            int lastDig = bi % 10;          // last binary digit
            decNum = decNum + (lastDig * power);
            power = power * 2;
            bi = bi / 10;
        }

        System.out.println(decNum);  // Output: 10
    }
}
