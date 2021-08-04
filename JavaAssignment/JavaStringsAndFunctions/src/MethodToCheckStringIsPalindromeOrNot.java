import java.util.Scanner;

public class MethodToCheckStringIsPalindromeOrNot {
    static boolean palindromeOrNot(String str) {
        int a = 0, b = str.length() - 1;
        while (a < b) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;

            }
            a++;
            b--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if (palindromeOrNot(str1))
            System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}