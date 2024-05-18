package sdp.prac2;
//IMPORTED LIBRARIES 
import java.util.ArrayList;
import java.util.List;

//MAIN CLASS
public class SimpleFunctions {
    public SimpleFunctions() {
    }
    public static List<Integer> Task6(List<Integer> numbers) {
        // Create a new list to store the rounded numbers
        List<Integer> result = new ArrayList<>();
        // loop through each element of the numbers input list 
        for (int i = 0; i < numbers.size(); i++) {
            // Retrieve the current number from the input list
            int number = numbers.get(i);
            // Check if the number is already a multiple of 100
            if (number % 100 == 0) {
                // If True then  add the number as it is to the result list
                result.add(number);
            } else {
                // If the number is not a multiple of 100  round it up to the next multiple
                // Calculate the rounded number
                int rounded = ((number / 100) + 1) * 100;
                // Add the rounded number to the result list
                result.add(rounded);
            }
        }
        
        // Return the list containing the rounded numbers
        return result;
    }
}
