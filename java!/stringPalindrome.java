import java.util.*;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        if (str.equals(rstr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
