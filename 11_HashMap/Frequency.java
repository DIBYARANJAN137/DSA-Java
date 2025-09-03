import java.util.*;
public class Frequency {
    public static void freq(int arr[]){
       HashMap<Integer,Integer> mp =new HashMap<>();

       for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            }else{
                int value=mp.get(arr[i]);
                mp.put(arr[i], value+1);
            }
       }

       for(var e:mp.keySet()){
        System.out.println(e+"    "+mp.get(e));
       }
    }
  public static void main(String[] args) {
    int arr[]={1,3,2,1,4,1};
    freq(arr);
  }    
}
