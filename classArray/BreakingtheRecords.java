package classArray;
import java.util.ArrayList;
import java.util.List;

public class BreakingtheRecords {

     public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        int minimumScore=scores.get(0);
        int maximumScore=scores.get(0);
        int minRecord=0;
        int maxRecord=0;
        for(int i=1;i<scores.size();i++){
            if(scores.get(i)<minimumScore){
                minimumScore=scores.get(i);
                minRecord++;
            }
            if(scores.get(i)>maximumScore){
                maximumScore=scores.get(i);
                maxRecord++;
            }
        }
        result.add(maxRecord);
        result.add(minRecord);
        return result;
     }
         public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(java.util.Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
        List<Integer>results = breakingRecords(arr);
        System.out.println(results);
    }
    
}
