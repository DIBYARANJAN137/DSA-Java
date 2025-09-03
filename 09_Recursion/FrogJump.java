public class FrogJump {
    public static int best(int height[],int n,int idx){
        if(idx==n-1) return 0;
        int option1=best(height, n, idx+1)+Math.abs(height[idx+1]-height[idx]);
        if(idx==n-2) return option1;
        int option2=best(height, n, idx+2)+Math.abs(height[idx+2]-height[idx]);
        return Math.min(option1, option2);
    }
    public static void main(String[] args) {
        int height[]={10,30,20,40};
        System.out.println(best(height, height.length, 0));
    }
}
