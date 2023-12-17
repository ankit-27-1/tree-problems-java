class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        while(k>0){
           Arrays.sort(nums);
           nums[0]=-nums[0];
           k--; 
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}
