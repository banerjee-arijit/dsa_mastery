package classArray;
import java.util.HashMap;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    for(int i=0;i<arr.size();i++){
        countMap.put(arr.get(i), countMap.getOrDefault(arr.get(i), 0) + 1);

    }

    for(Integer key:countMap.keySet()){
        if(countMap.get(key)==countMap.values().stream().max(Integer::compareTo).orElse(0)){
            return key;
        }
    }
    return -1;

    }
    public static void main(String[] args) {
        List<Integer>list=List.of(1 ,2, 3, 4, 5, 4, 3 ,2 ,1, 3, 4);
        System.out.println(migratoryBirds(list));
        
    }
    
}
