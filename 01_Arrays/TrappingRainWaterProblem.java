public class TrappingRainWaterProblem {
    public static int trappedRainWater(int height[]){
        int trappedWater=0;

        //calculate leftMax Boundary
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate RightMax Boundary
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
        rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        //calculate Waterlevel
        for(int i=0;i<height.length;i++){
            int Waterlevel=Math.min(leftMax[i], rightMax[i]);
            //trappedWater
            trappedWater+=Waterlevel-height[i];
        }
        

        return trappedWater;
    }
    public static void main(String args[]){
     //int height[]={4,2,0,6,3,2,5};
     int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
     System.out.println(trappedRainWater(height));
    }
}
