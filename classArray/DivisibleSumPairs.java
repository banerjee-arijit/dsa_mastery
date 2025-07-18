package classArray;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if (i < j && ((ar.get(i) + ar.get(j)) % k == 0)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 6, 1, 2);
        int n = 6;
        int k = 3;
        System.out.println(divisibleSumPairs(n, k, list)); // Output: 5
    }

}
