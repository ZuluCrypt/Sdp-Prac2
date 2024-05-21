package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
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