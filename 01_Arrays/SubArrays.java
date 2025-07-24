public class SubArrays {
    public static void printSubarrays(int arr[]){
        int currSum=0;
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print (arr[k]+" ");
                   currSum+=arr[k];
                    if(minSum>currSum){
                        minSum=currSum;
                    }
                    if(maxSum<currSum){
                       maxSum=currSum;
                    }
                }
                System.out.println();
                System.out.println("sum: "+currSum);
                currSum=0;
                 
            }
            System.out.println();
        }
        
       System.out.println("Maximum sum:"+maxSum);
       System.out.println("Minimum sum:"+minSum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        //int arr[]={1,-2,6,-1,3};
        printSubarrays(arr);
    }
}
