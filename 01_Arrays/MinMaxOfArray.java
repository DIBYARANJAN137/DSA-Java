public class MinMaxOfArray {
    public static int largestInArray(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int smallestOfArray(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr={12,32,21,43,35,65,23,15};
        System.out.println("Largest element inside the array: "+largestInArray(arr));
                System.out.println("Smallest element inside the array: "+smallestOfArray(arr));

    }
}
