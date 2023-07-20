package Two_Pointers;

public class Q680_Valid_Palindrome_II {
    public static void main(String[] args) {

    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }
    private boolean isPalindrome(String s, int right, int left){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}
