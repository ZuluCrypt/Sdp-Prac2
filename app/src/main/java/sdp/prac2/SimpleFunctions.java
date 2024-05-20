package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
   public static int sumByIndexes(List<Integer> a, List<Integer> b) {
        int sum = 0;

        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }

        return sum;
    }
}
