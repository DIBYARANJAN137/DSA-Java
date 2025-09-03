public class RemoveOccurences {
    public static String removeOccurencesA2(String s){
        if(s.length()==0) return "";
        String smallAns=removeOccurencesA2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar!='a'){
           return currChar+smallAns;
        }else{
            return smallAns;
        }
    }
     public static String removeOccurencesA(String s,int idx){
        if(idx==s.length()) return "";
        String smallAns=removeOccurencesA(s, idx+1);
        char currChar=s.charAt(idx);
        if(currChar!='a'){
           return currChar+smallAns;
        }else{
            return smallAns;
        }
     }
    public static void main(String[] args) {
        String s="aabscgdfaa";
        
        System.out.println(removeOccurencesA(s, 0));
        System.out.println(removeOccurencesA2(s));
    }
}
