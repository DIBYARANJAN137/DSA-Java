public class RemoveDuplicates {
    public static String removeDuplicates(String s,int idx,boolean seen[]){
        
        
        if (idx==s.length()) {
            return "";
        }
        char currChar=s.charAt(idx);
        int key=currChar-'a';
         

        if(seen[key]){
            return removeDuplicates(s, idx+1,seen);
        }else{
            seen[key]=true;
            return currChar+removeDuplicates(s, idx+1,seen);
        }
    }
     public static void main(String[] args) {
        boolean seen[]= new boolean[26];
        String s="aapnnacollege";//apnacolege
        System.out.println(removeDuplicates(s, 0,seen));
     }
    }
    

