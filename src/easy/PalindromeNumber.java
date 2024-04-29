package easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String aux = String.valueOf(x);
        String palindrome = new StringBuilder(aux).reverse().toString();
        return aux.equals(palindrome);
    }

}
