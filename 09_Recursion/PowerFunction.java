public class PowerFunction {
    public static int powerFunction(int p,int q){
        if(q==0){
            return 1;
        }
       //return  powerFunction(p, q-1)*p;
       int smallAns=powerFunction(p, q/2);
       if(q%2==0){
        
        return smallAns*smallAns;
       }
        return p*smallAns*smallAns;
    }
    public static void main(String[] args) {
        System.out.println(powerFunction(5, 3));
    }
}
