class Solution {
    public int maxProfit(int[] a) {
        
        int min =Integer.MAX_VALUE;
        int maxprofit=0;

        for(int x:a){
            if(x<min){
                min=x;
            }

            int profit=x-min;

            if(profit>maxprofit){
                maxprofit=profit;
            }

        }
        return maxprofit;
    }
}
