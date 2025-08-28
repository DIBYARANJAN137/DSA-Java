public class MaxelementInArray {
    public static int findMax(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=findMax(arr, idx+1);
        return Math.max(smallAns, arr[idx]);
    }
    public static void main(String[] args) {
        int arr[]={14,2,5,7,9};
        System.out.println(findMax(arr,0));
    }
}
