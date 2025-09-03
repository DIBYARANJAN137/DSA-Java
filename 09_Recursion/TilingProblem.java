public class TilingProblem {
    public static int tilingFloorWays(int n){
        if(n==0||n==1){
          return 1;
        }

        return tilingFloorWays(n-1)+tilingFloorWays(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(tilingFloorWays(n));
    }
}
