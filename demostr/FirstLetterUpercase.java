package demostr;

public class FirstLetterUpercase {
    public static void setFirstLetterToUppercase(String str) {
        StringBuilder sb=new StringBuilder();
        char firstChar=Character.toUpperCase(str.charAt(0));
        sb.append(firstChar);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(" ");
                if(i<str.length()-1){
                    sb.append(Character.toUpperCase(str.charAt(i+1)));
                    i++;
                }
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String name="hi i am arijit";
        setFirstLetterToUppercase(name);
    }
    
}
