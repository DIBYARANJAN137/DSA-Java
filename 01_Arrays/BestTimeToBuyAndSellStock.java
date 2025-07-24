public class BestTimeToBuyAndSellStock {
    public static int buyAndSellStock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }else{
               int  profit=prices[i]-buyPrice;
               maxProfit=Math.max(maxProfit, profit);
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        // int prices[]={7,1,5,3,6,4};
        // int prices[]={8,2,4,9,1,6};
        int prices[]={5,4,3,2,1};
        System.out.println(buyAndSellStock(prices));
    }
}
