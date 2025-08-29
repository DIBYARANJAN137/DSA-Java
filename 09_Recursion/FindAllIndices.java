import java.util.ArrayList;

public class FindAllIndices{
    public static void printAllIndices(int arr[],int length,int target,int idx){
        if(idx>=length){
            return;
        }
        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        printAllIndices(arr, length, target, idx+1);
    }
    public static ArrayList<Integer> allIndices(int arr[],int length,int target,int idx){
        ArrayList<Integer> ans =new ArrayList<>();
        if(idx>=length){
            return new ArrayList<Integer>();
        }
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns= allIndices(arr, length, target, idx+1);
        ans.addAll(smallAns);
        return ans;

    }
 public static void main(String[] args) {
    int arr[]={8,8,8};
    int length=arr.length;
    printAllIndices(arr, length, 8, 0);
    ArrayList<Integer> ans= allIndices(arr, length, 8, 0);
    for(int answer:ans){
        System.out.println(answer);
    }

 }
}