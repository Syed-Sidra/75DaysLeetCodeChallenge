class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> countMp = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            countMp.put(ch,countMp.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!countMp.containsKey(ch) || countMp.get(ch) == 0){
                return false;
            }
            countMp.put(ch,countMp.get(ch)-1);
        }
        return true;
    }
}