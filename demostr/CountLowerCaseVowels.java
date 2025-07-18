package demostr;

public class CountLowerCaseVowels {

    public static int countLowerCaseVowels(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.toLowerCase(str.charAt(i))=='a'|| Character.toLowerCase(str.charAt(i))=='e' || Character.toLowerCase(str.charAt(i))=='i' || Character.toLowerCase(str.charAt(i))=='o' || Character.toLowerCase(str.charAt(i))=='u'){
                count++;
            }
    }
    return count;
    }
    public static void main(String[] args) {
        String str="ShadraDidi";
        System.out.println("Number of lowercase vowels in the string: " + countLowerCaseVowels(str));
    }
    
}
