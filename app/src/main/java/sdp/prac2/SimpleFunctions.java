package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0;

        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }

        return sum;
    }

    public static List<String> Task2(List<String> lst) {
        List<String> result = new ArrayList<>();  //this will be the list with the resultant list that has the first character removed
        for (int i = 0; i < lst.size(); i++) {
            String updatedElem = lst.get(i);
            //this checks if the element has anything in it and if not then it removes it from the list
            if (updatedElem.length() > 0) {
                //this is where the first character is removed for each element within the list
                result.add(updatedElem.substring(1));
            }
        }
        return result;
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

    //reverse list b and store in reversedList
    private static List<Integer> reverseList(List<Integer> listToReverse){
                List<Integer> reversed = new ArrayList<>(); //reverse list variable to store the reversed list
                for(int i = listToReverse.size()-1; i >= 0; i--){
                    reversed.add(listToReverse.get(i));
                }return reversed;
            }
    //task4
    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(); //created result variable of type List<integer> to store the result
        //check if the two lists are of the same size
        if (a.size() != b.size()){
                return null;
        }else{  //if the two lists are of the same size then add each element in a to the corresponding element in the reversed list of b
            List<Integer> reversedList = reverseList(b); //reverse list b 
            for(int i = 0 ; i < a.size(); i++){
                result.add(a.get(i) * reversedList.get(i));
            }
        }
        return result;
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
}