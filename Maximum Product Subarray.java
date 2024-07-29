class Solution {
    public int maxProduct(int[] nums) {
        double prefix=1,suffix=1;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0)
            prefix=1;
            if(suffix==0)
            suffix=1;
            prefix=(double)prefix*nums[i];
            suffix=(double)suffix*nums[n-1-i];
            maxi=(int)Math.max((double)maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }
}
