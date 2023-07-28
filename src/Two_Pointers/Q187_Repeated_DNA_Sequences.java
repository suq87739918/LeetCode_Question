package Two_Pointers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q187_Repeated_DNA_Sequences {
    public static void main(String[] args) {

    }
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> output = new HashSet<>();

        //special case
        if(s.length() < 10 || s == null){
            return new ArrayList<>(output);
        }

        for(int i = 0; i + 9 < s.length(); i++){
            String substring = s.substring(i, i + 10);
            if(!seen.add(substring)){
                output.add(substring);
            }
        }
        return new ArrayList<>(output);
    }
}
