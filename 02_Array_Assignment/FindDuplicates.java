public class FindDuplicates {
    public static boolean findDuplicatesInArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int nums[]={1,2,3,1};
         //int nums[]={1,1,1,3,3,4,3,2,4,2};
         int nums[]={1,2,3,4};
        System.out.println(findDuplicatesInArray(nums));

    }
}
