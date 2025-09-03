public class CheckPallindrome {
    public static boolean  checkPallindrome(String s,int lp,int rp){
        if(lp==rp) return true;

       return (s.charAt(lp)==s.charAt(rp)&&checkPallindrome(s, lp+1, rp-1));
             
    } 
    public static void main(String[] args) {
        String s="LEVEL";
        System.out.println(checkPallindrome(s, 0, s.length()-1));
    }
}
