class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        int[] record = new int[26];
        for (int count1 : magazine.toCharArray()){
            record[count1 - 'a']+=1;
            
        }
        for (int count2 : ransomNote.toCharArray()){
            record[count2 - 'a']-=1;
            
        }

        for (int val : record){
            if ( val < 0){
                return false;
            }
        }
        return true;

        
    }
}