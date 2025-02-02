class Solution {
    public String findValidPair(String s) {
        Map<Character , Integer> mp = new HashMap<>();
        for(char c: s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);

            if(first != second && mp.get(first) == Character.getNumericValue(first) && mp.get(second) == Character.getNumericValue(second)) return ""+first+second;
        }
        return "";
    }
}
