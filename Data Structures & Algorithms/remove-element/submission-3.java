class Solution {
    public int removeElement(int[] nums, int val) {
        int slowpointer = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[slowpointer] = nums[i];
                slowpointer++;
            }

        }
        return slowpointer;
    }
}