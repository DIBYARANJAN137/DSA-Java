public class CheckPalindrome {

    public static boolean isPallindrome(String str){
        // for(int i=0;i<str.length()/2;i++){
        //     if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        //         return false;
        //     }
            
        // }
        // return true;


        int i=0,j=str.length()-1;
        while (i<j) {
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str="racecar";
        //String str="Dibya";
       System.out.println( isPallindrome(str));
    }
}
