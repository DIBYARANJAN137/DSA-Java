import java.util.*;
public class Checkanagram {
    public static boolean isAnagram(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        char str1tochararray[]= str1.toCharArray();
        char str2tochararray[]= str2.toCharArray();
        if(str1.length()!=str2.length()){
            return false;
        }
        Arrays.sort(str1tochararray);
        Arrays.sort(str2tochararray);
         return Arrays.equals(str1tochararray, str2tochararray);
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
         
        System.out.println(isAnagram(str1, str2));
    }
}
