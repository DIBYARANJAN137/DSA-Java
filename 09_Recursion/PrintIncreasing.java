public class PrintIncreasing {
    public static void printIncerasing(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
         printIncerasing(n-1);
         System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=15;
        printIncerasing(n);
    }

}
