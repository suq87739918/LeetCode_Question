package Top_Interview_150;

public class Q125_Valid_Palindrome {
    public static void main(String[] args) {

    }
//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        if(s.isEmpty()){
//            return true;
//        }
//        int pt1 = 0;
//        int pt2 = s.length() - 1;
//        while(pt1 < pt2){
//            if(s.charAt(pt1) != s.charAt(pt2)){
//                return false;
//            }
//            pt1++;
//            pt2--;
//        }
//        return true;
//    }
    //better way
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return true;  // An empty string should be considered a palindrome
        }
        int pt1 = 0;
        int pt2 = s.length() - 1;

        while(pt1 <= pt2){
            char currLeft = s.charAt(pt1);
            char currRight = s.charAt(pt2);
            if(!Character.isLetterOrDigit(currLeft)){
                pt1++;
                // Check if pt1 is still within boundary
                if (pt1 > s.length() - 1) break;
            }else if(!Character.isLetterOrDigit(currRight)){
                pt2--;
                // Check if pt2 is still non-negative
                if (pt2 < 0) break;
            }else {
                if(Character.toLowerCase(currLeft) != Character.toLowerCase(currRight)){
                    return false;
                }
                pt1++;
                pt2--;
            }
        }
        return true;
    }
}

