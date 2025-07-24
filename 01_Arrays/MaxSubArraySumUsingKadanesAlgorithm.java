public class MaxSubArraySumUsingKadanesAlgorithm {
    public static void kadanes_Algorithm(int arr[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
             if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
             
        }
        System.out.println("Max SubArray sum:"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        //int arr[]={-3,-1,-2};

        kadanes_Algorithm(arr);
    }
}
