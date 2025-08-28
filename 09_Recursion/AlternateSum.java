public class AlternateSum {
    public static int findAlternateSum(int n){
        if(n==0){
            return n;
        }
        int smallAns=findAlternateSum(n-1);
        if(n%2==0){
            return smallAns-n;
        }else{
            return smallAns+n;
        }
    }
    public static void main(String[] args) {
        System.out.println(findAlternateSum(5));
    }
}
