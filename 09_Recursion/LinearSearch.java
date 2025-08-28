public class LinearSearch {
    public static boolean linearSearch(int arr[],int target,int idx){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return linearSearch(arr, target, idx+1);

         
    }
    public static void main(String[] args) {
        int arr[]={1,6,8,2,9,3,5};
         if(linearSearch(arr, 12, 0)){
            System.out.println("Yes");
         }else{
            System.out.println("No");
         }
    }
}
