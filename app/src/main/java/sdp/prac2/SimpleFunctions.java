package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public boolean Task3(String s) {
        char[] characters = s.toCharArray();
        int stack = 0;
        for (int i = 0; i < characters.length; i++) {
            if (stack == 0 && characters[i] == ')') {
                return false;
            }
            if (characters[i] == '(') {
                stack++;
            } else if (characters[i] == ')') {
                stack--;
            }
        }
        if (stack == 0) {
            return true;
        } else
            return false;
    }
}
