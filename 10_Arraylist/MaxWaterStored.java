import java.util.ArrayList;

public class MaxWaterStored {
    // public static int maxWaterStoredInContainer(ArrayList<Integer> list){
    //     int maxWaterStored=Integer.MIN_VALUE;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             int height=Math.min(list.get(i), list.get(j));
    //             int width= j-1;
    //             int waterStored=height*width;
    //             maxWaterStored=Math.max(maxWaterStored, waterStored);
    //         }
    //     }
    //     return maxWaterStored;
    // }





    public static int maxWaterStoredInContainer(ArrayList<Integer> list){
        int maxWaterStored=Integer.MIN_VALUE;
         int lp=0;
         int rp=list.size()-1;
         while(lp<rp){
            int height=Math.min(list.get(lp), list.get(rp));
             int width= rp-lp;
             int waterStored=height*width;
             maxWaterStored=Math.max(maxWaterStored, waterStored);
             if(list.get(lp)<list.get(rp)){
             lp++;
             }else{
                rp--;
             }
            }
                
            return maxWaterStored;   
        
        
    }  
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println("Maximum Water Stored is "+maxWaterStoredInContainer(list)+" units");
    }
}
