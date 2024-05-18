package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public boolean Task3(String s) {
        // convert to array of characters
        char[] characters = s.toCharArray();
        // increments for each '(', and decrements for each ')'
        int stack = 0;
        for (int i = 0; i < characters.length; i++) {
            // check if closing bracket has no corresponding open bracket
            if (stack == 0 && characters[i] == ')') {
                return false;
            }
            if (characters[i] == '(') {
                stack++;
            } else if (characters[i] == ')') {
                stack--;
            }
        }
        // if stack == 0, number of opening/closing brackets are equal
        if (stack == 0) {
            return true;
        } else
            return false;
    }
}
