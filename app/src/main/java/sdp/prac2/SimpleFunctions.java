package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

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

    //reverse list b and store in reversedList
    private static List<Integer> reverseList(List<Integer> listToReverse){
                List<Integer> reversed = new ArrayList<>(); //reverse list variable to store the reversed list
                for(int i = listToReverse.size()-1; i >= 0; i--){
                    reversed.add(listToReverse.get(i));
                }return reversed;
            }

    public static boolean Task5(List<Integer> lst) {
        if (lst.isEmpty()) {
            return true; // An empty list is considered sorted
        }
        // Check if the list is sorted in non-decreasing order and return true if sorted
        for (int i = 0; i < lst.size() - 1; i++) {
            if (lst.get(i) > lst.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 100 == 0) {
                // If number is already a multiple of 100, leave it unchanged
                roundedNumbers.add(number);
            } else {
                // Round up to the next-highest multiple of 100
                int roundedNumber = ((number / 100) + 1) * 100;
                roundedNumbers.add(roundedNumber);
            }
        }

        return roundedNumbers;
    }
}