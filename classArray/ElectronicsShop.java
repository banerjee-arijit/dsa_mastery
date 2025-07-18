package classArray;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int start = 0;
        int end = keyboards.length - 1;
        int max = 0;
        while (start <= end) {
            int sum = keyboards[start] + drives[end];
            if (sum >= b) {
                end--;
            } else {
                max = Math.max(max, sum);
                start++;
            }
        }
        return max>0? max : -1;
    }

    public static void main(String[] args) {
        int[] keyboards = { 4 };
        int[] drives = { 5 };
        int b = 5;
        System.out.println(getMoneySpent(keyboards, drives, b)); // Output: 8
    }

}