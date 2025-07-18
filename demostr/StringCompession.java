package demostr;

import java.util.HashMap;

public class StringCompession {
    public static void main(String[] args) {
        String str = "banana";
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<str.length();i++){
        map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
    }
    StringBuilder sb=new StringBuilder();
    for(char c:map.keySet()){
        sb.append(c).append(map.get(c));
    }
    System.out.println(sb.toString());
    }
}
