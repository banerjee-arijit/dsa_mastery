package classArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int windowsum = 0;
        int count = 0;
        for (int i = 0; i < m; i++)
            windowsum += s.get(i);
        if (windowsum == d)
            count++;
        for (int i = m; i < s.size(); i++) {
            windowsum = windowsum - s.get(i - m) + s.get(i); // slide the window
            if (windowsum == d)
                count++;

            ;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
        System.out.println(birthday(list, 3, 2));
    }

}
