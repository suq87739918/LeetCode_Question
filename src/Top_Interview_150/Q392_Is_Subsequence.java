package Top_Interview_150;

public class Q392_Is_Subsequence {
    public static void main(String[] args) {

    }
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        int pointerS = 0;
        int pointerT = 0;

        while(pointerS < s.length() && pointerT < t.length()){
            if(s.charAt(pointerS) == t.charAt(pointerT)){
                pointerS++;
            }
            pointerT++;
        }
        return pointerS == s.length();
    }

}
