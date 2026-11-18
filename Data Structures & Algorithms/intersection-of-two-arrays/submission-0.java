class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            seen.add(nums1[i]);
        }
        Set<Integer> common = new HashSet<>();
        for (int num : nums2){
            if(seen.contains(num)){
                common.add(num);
            }
        }

        int[] result = new int[common.size()];
        int index = 0;
        for (int val: common){
            result[index++] = val;
        }
        return result;
        
    }
}