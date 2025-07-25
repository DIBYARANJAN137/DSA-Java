public class MaxSubArraySumUsingPrefixSum {
    public static void maxSubArraysumUsingPrefixSum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(prefix[i]+" ");
        // }
        //System.out.println();

        for(int i=0;i<arr.length;i++){
            int start=i;
            int currSum=0;
            for(int j=i;j<arr.length;j++){
                int end=j;
            currSum=  start == 0 ? prefix[end] : prefix[end] -prefix[start-1];
             
            }
           
             if(maxSum<currSum){
                       maxSum=currSum;
                    }
        }

        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
       maxSubArraysumUsingPrefixSum(arr);
    }
}
