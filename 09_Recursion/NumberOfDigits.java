public class NumberOfDigits {
    public static int numberOfDigits(int n){
        if(n>=1&&n<=9){
            return 1;
        }
     return numberOfDigits(n/10)+1;
    }
   
    public static void main(String[] args) {
        int n=32345;
        System.out.println("Number of digits in "+ n +" is:"+numberOfDigits(n));
        
    }
}
