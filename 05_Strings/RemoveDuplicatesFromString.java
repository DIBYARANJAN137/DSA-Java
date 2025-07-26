public class RemoveDuplicatesFromString {
    public static String removeDuplicate(String str){
        StringBuilder sb = new StringBuilder();
        boolean seen[]= new boolean[256];
        for(char ch:str.toCharArray()){
            if(!seen[ch]){
                seen[ch]=true;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="programming";
        System.out.println(removeDuplicate(str));
        
    }
}
