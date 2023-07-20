package String;

public class Q520_Detect_Capital {
    public static void main(String[] args) {

    }
    public boolean detectCapitalUse(String word) {
        int countUpper = 0;
        int countLower = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                countUpper++;
            }else if(!Character.isUpperCase(word.charAt(i))){
                countLower++;
            }
        }
        if(countUpper == word.length() || countLower == word.length() || (Character.isUpperCase(word.charAt(0)) && countLower == word.length() - 1)){
            return true;
        }
        return false;
    }
}
