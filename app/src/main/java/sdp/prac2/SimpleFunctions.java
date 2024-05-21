package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
       public static boolean Task5(List<Integer> lst) {
          if (lst.isEmpty()) {
            return true; // An empty list is considered sorted
        }
        // Check if the list is sorted in non-decreasing order and return true is sorted
        for (int i = 0; i < lst.size() - 1; i++) {
            if (lst.get(i) > lst.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
