package sdp.prac2;
//IMPORTED LIBRARIES 
import java.util.ArrayList;
import java.util.List;

//MAIN CLASS
public class SimpleFunctions {
    public SimpleFunctions() {}

    //following code is for Task 2 which takes a list with elements removes the first character from every element in a list and returns a resultant list

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
}
