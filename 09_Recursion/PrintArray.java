public class PrintArray {
    public static void printArray(int arr[],int idx){
        int n=arr.length;
        if(idx==n){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={4,6,2,7,3,8};printArray(arr, 0);

    }
}
