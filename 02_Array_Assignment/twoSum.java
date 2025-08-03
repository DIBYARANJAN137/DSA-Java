public class twoSum {
    public static void twoSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                 if(arr[i]+arr[j]==target){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8};
        twoSum(arr, 5);  
    }
}
