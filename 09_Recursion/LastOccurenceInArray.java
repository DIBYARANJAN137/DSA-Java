public class LastOccurenceInArray {
    public static int findLastOccurence(int arr[],int length,int target,int idx){
        if(idx<0){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return findLastOccurence(arr, length, target, idx-1);
    }
    public static void main(String[] args) {
        //int arr[]={12,34,65,87,12, 67};
        // int arr[]={};
        //int arr[]={12};
        int arr[]={13};
        System.out.println(findLastOccurence(arr, arr.length, 12, arr.length-1));
    }
}
