class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevArray = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(prevArray.containsKey(diff)){
                return new int[] {prevArray.get(diff),i};

            }
            prevArray.put(num, i);
        }
        return new int[] {};
        

        
    }
}
