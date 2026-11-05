class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str: strs){
            int[] counts = new int[26];
            for( int i=0; i < str.length(); i ++){
                counts[str.charAt(i)-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for (int count : counts){
                key.append("#");
                key.append(count);
            }
            groups.computeIfAbsent(
                key.toString(), k -> new ArrayList<>()
            ).add(str);
        }
        return new ArrayList<>(groups.values());
        
    }
}
