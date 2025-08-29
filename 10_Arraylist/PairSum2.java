import java.util.ArrayList;

public class PairSum2 {
    public static boolean findPairSum2(ArrayList<Integer> list,int target){
        int n=list.size();
        int bp=-1;
        for(int i=0;i<list.size()-1;i++){
            
          if(list.get(i)>list.get(i+1)){
            bp=i;
            break;
          }
        }
         int leftPointer=(bp+1)%n;
        int rightPointer=bp;
    
        
        while(leftPointer!=rightPointer){
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }
            if(list.get(leftPointer)+list.get(rightPointer)<target){
                leftPointer=(leftPointer+1)%n;
            }else{
                rightPointer=(n+rightPointer-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(findPairSum2(list, 17));
    }
}
