public class NthFibonacci {
    public static int findNthFibonacci(int n){
        if(n==0||n==1){
            return n;
        }
         return  findNthFibonacci(n-1)+findNthFibonacci(n-2);
        
         
    }
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
        System.out.println(findNthFibonacci(i));
        }
    }
}
