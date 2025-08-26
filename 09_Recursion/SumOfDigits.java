public class SumOfDigits {
    public static int sumOfdigits(int n){
        if(n>=0&&n<=9){
            return n;
        }
        // int smallAns=sumOfdigits(n/10);
        // int ans=smallAns+(n%10);
        // return ans;

        return sumOfdigits(n/10)+n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfdigits(1234));
    }
}
