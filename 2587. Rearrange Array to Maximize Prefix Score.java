class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long total=0;
        int max=0;
        int n=nums.length-1;
        for(int i=n;i>=0;i--){
             total += nums[i];
             if(total>0){
                max++;
            }
        }
        
    return max;
    }
}