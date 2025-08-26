public class FindFactorial {
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        // int smallAns=findFactorial(n-1);
        // int ans=n*smallAns;
        // return ans;

        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is:"+findFactorial(n));
    }
}
