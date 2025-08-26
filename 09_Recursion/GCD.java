public class GCD {
    
    //Iterative Approach
    public static int FindGcd(int x,int y){
        while(x%y!=0){
            int rem= x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    //brute force approach
    public static int BruteGcd(int x,int y){
        int min =Math.min(x, y);
        int max=0;
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0 && max<i){
                max=i;
                
            }
        }
        return max;
    }

    //Recursive Approach
    public static int findGcd(int x,int y){
        if(y==0){
            return x;
        }

        return findGcd(y, x%y);
    }
    public static void main(String[] args) {
       System.out.println(findGcd(18,24));
       System.out.println(FindGcd(18,24));
      System.out.println( BruteGcd(15,24));

    }
}
