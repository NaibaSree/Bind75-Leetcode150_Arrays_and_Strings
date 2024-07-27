class Solution {
    public int maxProfit(int[] arr) {
        int buyprice=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(buyprice>arr[i])
            buyprice=arr[i];
            profit=Math.max(profit,arr[i]-buyprice);
        }
        return profit;
    }
}
