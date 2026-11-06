class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums){
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length ; i ++){
            bucket.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            int num = entry.getKey();
            int frequency = entry.getValue();
            bucket.get(frequency).add(num);
        }
        int[] result = new int[k];
        int index = 0;
        for (int frequency = nums.length; frequency > 0; frequency--){
            for (int n : bucket.get(frequency)){
                result[index] = n;
                index++;
                if(index == k){
                    return result;
                }
            }
        }
        return result;

    }
}
