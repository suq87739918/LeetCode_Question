package String;

public class Q434_Number_of_Segments_in_a_String {
    public static void main(String[] args) {
        String s1 = "Hello, my name is John";
        String s2 = "Hello";
        String s3 = "";
    }
    public static int countSegments(String s) {
        int count = 0;
        for(int i =0 ; i < s.length(); i++){
            if((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }
}
