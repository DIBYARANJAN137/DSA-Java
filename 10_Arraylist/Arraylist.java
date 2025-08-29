import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        num.add(10);
        num.add(11);
        num.add(12);
        // System.out.println(num.size());
        // System.out.println(num.get(2));
        // for(int i=0;i<num.size();i++){
        //     System.out.print(num.get(i)+" ");
        // }
        // System.out.println(num);
    // for(int nums:num){
    //        System.out.print(nums+" ");
    // }

        //num.remove(0);
        
        //System.out.println(num.remove(Integer.valueOf(11)));
        System.out.println(num.isEmpty());
        //num.clear();
        System.out.println(num);
    }
}
