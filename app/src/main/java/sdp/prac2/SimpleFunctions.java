package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    //reverse list b and store in reversedList
    public static List<Integer> reverseList(List<Integer> listToReverse){
                List<Integer> reversed = new ArrayList<>(); //reverse list variable to store the reversed list
                for(int i = listToReverse.size()-1; i >= 0; i--){
                    reversed.add(listToReverse.get(i));
                }return reversed;
            }

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
}
