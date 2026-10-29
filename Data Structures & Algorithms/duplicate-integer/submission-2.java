class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> same = new HashSet<>();
        for (int num: nums) {
            if(same.contains(num)){
                return true;
            }
            same.add(num);
        }
        return false;
    }
}