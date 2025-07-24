/*FIND FIRST AND LAST OCCURENCE OF AN ELEMENT IN AN SORTED ARRAY
-USE TWO MODIFIED BINARY SEARCHES
-ONE FOR FIRST  OCCURENCE 
-ONE FOR LAST OCCURECNCE
*/  
public class FirstAndLastPosition {

    // Find first occurrence of target
    public static int findFirst(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;       // Save index
                end = mid - 1;   // Search on the left
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    // Find last occurrence of target
    public static int findLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;       // Save index
                start = mid + 1; // Search on the right
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First position: " + first);
        System.out.println("Last position: " + last);
    }
}