class Solution {
    public int jump(int[] nums) {
        int reach=0,nextJump=0,jump=0;
        for(int i=0;i<nums.length-1;i++){
            nextJump=Math.max(nextJump,i+nums[i]);
            if(reach==i){
                jump++;
                reach=nextJump;
                if(reach>=nums.length-1){
                    return jump;
                }
            }
        }
        return jump;
    }
}