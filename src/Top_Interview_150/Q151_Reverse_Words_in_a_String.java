package Top_Interview_150;

public class Q151_Reverse_Words_in_a_String {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        // Split the input string into words.
        String[] words = s.trim().split("\\s+");

        // Create a StringBuilder to hold the result.
        StringBuilder output = new StringBuilder();

        // Iterate over the words in reverse order.
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word followed by a space.
            output.append(words[i]).append(' ');
        }

        // Trim the trailing space and convert the StringBuilder to a String.
        return output.toString().trim();
    }
}
