public class RemoveDuplicate {
    public static String removeOccurences(String s,int idx){
        if(idx==s.length()){
            return " ";
        }

        String smallAns=removeOccurences(s, idx+1);
         char currChar=s.charAt(idx);
         if(currChar!='a'){
         return currChar+smallAns;
         }else{
            return smallAns;
         }
        
    }
    public static void main(String[] args) {
        String s="abcax";
        
        System.out.println(removeOccurences(s, 0));
    }
}
