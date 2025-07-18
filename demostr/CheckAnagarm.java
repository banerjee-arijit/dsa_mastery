package demostr;

import java.util.HashMap;

public class CheckAnagarm {
    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
        }
        for(int i=0;i<str2.length();i++){
            map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
        }
        return map1.equals(map2);  // Compare the two hashmaps for equality. If they are equal, then the strings are anagrams.
    }
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "ab";
        System.out.println(isAnagram(str1, str2));
    }
    
}
