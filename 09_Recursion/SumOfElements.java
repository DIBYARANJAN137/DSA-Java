public class SumOfElements {
    public static int findSum(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        // int smallAns=findSum(arr, idx+1);
        // return smallAns+arr[idx];
        return arr[idx]+ findSum(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findSum(arr, 0));
    }
}
