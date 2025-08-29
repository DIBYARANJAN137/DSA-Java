public class IsSorted {
    public static boolean isSorted(int arr[], int idx) {
        // Base case: last element reached
        if (idx == arr.length - 1) {
            return true;
        }
        // Current pair check + recursive check
        if (arr[idx] <= arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5};   // true
        int arr[]={23,56,45,67,43,32,12}; // false
        System.out.println(isSorted(arr, 0));
    }
}

