package Stack_and_Recursion;

import java.util.Stack;

public class Q71_Simplify_Path {
    public static void main(String[] args) {

    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // Process each component
        for (String directory : components) {
            // A "." or empty component would not change the directory, so skip it
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } else if (directory.equals("..")) {
                // A ".." moves up one level, so remove the last directory from the stack if it's not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // A regular directory name, so add it to the stack
                stack.push(directory);
            }
        }

        // Reconstruct the canonical path
        StringBuilder result = new StringBuilder();     //refer to the bottom
        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}

/*
In Java, String objects are immutable, which means once a String object is created, it cannot be changed.
If you perform any operation that seems to modify a String, like concatenation, it actually creates a new String object.
This can lead to inefficiency if you are doing a lot of string operations, as each operation creates a new object, consuming memory and processing power.

StringBuilder, on the other hand, is a mutable sequence of characters. It is like a String, but can be modified.
It is designed for cases where you need to make modifications to strings, like appending, deleting, or inserting characters, especially inside loops.

In this case, we're using StringBuilder because we're appending strings in a loop.
If we used a String to do this, it would create a new String object in memory for each append operation, which is less efficient.

Finally, result.toString() is used to convert the StringBuilder object back into a String.
The toString method is a standard Java method found in all objects that returns a string representation of the object.
In the case of StringBuilder, it returns a String that has the exact same sequence of characters as the StringBuilder.
It's needed because our method is expected to return a String, not a StringBuilder.
 */
