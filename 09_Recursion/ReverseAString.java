public class ReverseAString {
    public static String reverse(String s,int idx){
        if(idx==s.length())return "";
        String smallAns=reverse(s, idx+1);
        char currChar=s.charAt(idx);
        return smallAns+currChar;
    }
    public static String reverse(String s){
        if(s.length()==0) return "";
        String smallAns=reverse(s.substring(1));
        char currChar=s.charAt(0);
        return smallAns+currChar;
    }
    public static void main(String[] args) {
        String s="Dibya";
        System.out.println(reverse(s));
        System.out.println(reverse(s,0));
    }
}
